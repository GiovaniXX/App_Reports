package customization;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class MyButton extends JButton implements MouseListener {

    private int radius = 0;
    private Color colorHover = new Color(153, 0, 0);
    private Color colorPressed = new Color(0, 0, 0);
    private Color colorNormal = new Color(255, 0, 0);
    private Color colorTextHover = new Color(255, 255, 255);
    private Color colorTextPressd = new Color(0, 0, 0);
    private Color colorTextNormal = new Color(255, 255, 255);

    public MyButton(Color White) {
        this.setBorder(null);
        this.setContentAreaFilled(false);
        this.setOpaque(true);
        this.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.setBackground(Color.red);
        this.setForeground(White);
        this.setPreferredSize(new Dimension(200, 40));
        this.setSize(200, 40);
        this.setCursor(new Cursor(12));

        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.setBackground(this.colorPressed);
        this.setForeground(this.colorTextPressd);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.setBackground(this.colorHover);
        this.setForeground(this.colorTextHover);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(this.colorHover);
        this.setForeground(this.colorTextHover);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(this.colorNormal);
        this.setForeground(this.colorTextNormal);
    }

    public Color getColorHover() {
        return colorHover;
    }

    public void setColorHover(Color colorHover) {
        this.colorHover = colorHover;
    }

    public Color getColorNormal() {
        return colorNormal;
    }

    public void setColorNormal(Color colorNormal) {
        this.colorNormal = colorNormal;
        this.setBackground(this.colorNormal);
    }

    public Color getColorTextHover() {
        return colorTextHover;
    }

    public void setColorTextHover(Color colorTextHover) {
        this.colorTextHover = colorTextHover;
    }

    public Color getColorTextNormal() {
        return colorTextNormal;
    }

    public void setColorTextNormal(Color colorTextNormal) {
        this.colorTextNormal = colorTextNormal;
        this.setForeground(this.colorTextNormal);
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
        this.setBackground(this.colorPressed);
    }

    public Color getColorTextPressd() {
        return colorTextPressd;
    }

    public void setColorTextPressd(Color colorTextPressd) {
        this.colorTextPressd = colorTextPressd;
        this.setForeground(this.colorTextPressd);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
}
