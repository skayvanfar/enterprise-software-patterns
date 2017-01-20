package StructuralPatterns.Proxy.VirtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Virtual Proxy Virtual Proxy acts as a representative for an object that may be expensive to create. The
 * Virtual Proxy often defers the creation of the object until it is needed; the Virtual Proxy
 * also acts as a surrogate for the object before and while it is being created. After that, the
 * proxy delegates requests directly to the RealSubject.
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/30/2016.
 */
// The ImageProxy implements the Icon interface.
public class ImageProxy implements Icon {

    // The imageIcon is the REAL icon that we eventually want to display when it’s loaded.
    ImageIcon imageIcon;

    // We pass the URL of the image into
    // the constructor. This is the image
    // we need to display once it’s loaded!
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        imageURL = url;
    }

    // We return a default width and height
    // until the imageIcon is loaded; then we
    // turn it over to the imageIcon.
    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    // Here’s where things get interesting.
    // This code paints the icon on the
    // screen (by delegating to the imageIcon). However, if we don’t have
    // a fully created ImageIcon, then we
    // create one. Let’s look at this closer
    // on the next page...
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) { // If we’ve got an icon already, we go ahead and tell it to paint itself.
            imageIcon.paintIcon(c, g, x, y);
        } else { // Otherwise we display the "loading" message.
            g.drawString("Loading CD cover, please wait...", x+300, y+190);
            if (!retrieving) {
                retrieving = true;
                /*
                * Here’s where we load the REAL icon image. Note that
                * the image loading with IconImage is synchronous: the
                * ImageIcon constructor doesn’t return until the image is
                * loaded. That doesn’t give us much of a chance to do
                * screen updates and have our message displayed, so we’re
                * going to do this asynchronously.
                */
                retrievalThread = new Thread(() -> {
                    try {
                        imageIcon = new ImageIcon(imageURL, "CD Cover");
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();
            }
        }
    }
}
