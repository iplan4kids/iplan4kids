import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by user on 4/3/2018.
 */

public class Watermark {

    public static void main(String[] args) throws IOException {

        // Parameters
        int HEIGHT, WIDTH; // width and height of resized image in pixels
        String imagePath; // path of the image to be resized and watermarked
        String watermarkText; // name of the provider
        int watermarkMaxHeightPercentage, watermarkMaxWidthPercentage; // relative size of watermark to the original image

        //example
        HEIGHT = 500;
        WIDTH = 500;
        imagePath = "/home/thomas/Desktop/Small-mario.png";
        watermarkText = "iplan.com";
        watermarkMaxHeightPercentage = 10; // 10% of the original image height
        watermarkMaxWidthPercentage = 90; // 25% of the original image height

        String CwatermarkText = "\u00a9 " + watermarkText; // name of the provider with C in front of it

        // ------------------------------ RESIZE IMAGE -------------------------------------

        // Get the path of the image
        File input = new File(imagePath);
        BufferedImage image = ImageIO.read(input);

        // resize BufferedImage
        BufferedImage resized = resize(image, HEIGHT, WIDTH);


        // ------------------------------ WATERMARK IMAGE -------------------------------------

        // output file
        File output = new File("/home/thomas/Desktop/Small-mario-watermarked.png");

        // adding text as overlay to an image
        addTextWatermark(CwatermarkText, "png", resized, output, watermarkMaxHeightPercentage, watermarkMaxWidthPercentage);

    }


    private static BufferedImage resize(BufferedImage img, int height, int width) {
        // getScaledInstance : Creates a scaled version of this image
        // SCALE_SMOOTH : Choose an image-scaling algorithm that gives higher priority to image smoothness than scaling speed
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // BufferedImage : describes an Image with an accessible buffer of image data
        // TYPE_INT_ARGB : Represents an image with 8-bit RGBA color components packed into integer pixels
        // In case of PNG images we set the image type to BufferedImage.TYPE_INT_ARGB
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // createGraphics : Creates a Graphics2D, which can be used to draw into this BufferedImage.
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }


    private static void addTextWatermark(String text, String type, BufferedImage image, File destination, int watermarkMaxHeightPercentage, int watermarkMaxWidthPercentage) throws IOException {

        // determine image type and handle correct transparency
        int imageType = "png".equalsIgnoreCase(type) ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
        BufferedImage watermarked = new BufferedImage(image.getWidth(), image.getHeight(), imageType);

        // initializes necessary graphic properties
        Graphics2D w = (Graphics2D) watermarked.getGraphics();
        w.drawImage(image, 0, 0, null);
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f);
        w.setComposite(alphaChannel);
        w.setColor(Color.BLACK);

        int fontSize = 1; // variable font size
        double watermarkMaxHeight = (image.getHeight() * watermarkMaxHeightPercentage) / 100;
        double watermarkMaxWidth = (image.getWidth() * watermarkMaxWidthPercentage) / 100;

        w.setFont(new Font(Font.SANS_SERIF, Font.BOLD, fontSize));
        FontMetrics fontMetrics = w.getFontMetrics();
        Rectangle2D rect = fontMetrics.getStringBounds(text, w);

        while((rect.getWidth() <= watermarkMaxWidth) && (rect.getHeight() <= watermarkMaxHeight)){
            fontSize++;
            w.setFont(new Font(Font.SANS_SERIF, Font.BOLD, fontSize));
            fontMetrics = w.getFontMetrics();
            rect = fontMetrics.getStringBounds(text, w);
        }

        // Testing
        //System.out.println(rect.getHeight());
        //System.out.println(rect.getWidth());
        //System.out.println(image.getWidth());
        //System.out.println(image.getHeight());

        // add text overlay to the image
        w.drawString(text, 0,  image.getHeight() - (int) rect.getHeight());
        ImageIO.write(watermarked, type, destination);
        w.dispose();
    }
}
