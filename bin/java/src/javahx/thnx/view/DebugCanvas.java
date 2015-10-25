package javahx.thnx.view;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DebugCanvas extends javax.swing.JPanel implements haxe.lang.IHxObject
{
	public DebugCanvas(haxe.lang.EmptyObject empty)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		super();
	}
	
	
	public DebugCanvas()
	{
		//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		super();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		return new javahx.thnx.view.DebugCanvas(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		return new javahx.thnx.view.DebugCanvas();
	}
	
	
	public javax.swing.JLayeredPane layer;
	
	public java.awt.Graphics2D canvas;
	
	public haxe.at.dotpoint.math.vector.IVector2 scaleFactor;
	
	public void initialize(haxe.at.dotpoint.math.vector.IVector2 dimension, haxe.at.dotpoint.math.vector.IVector2 scaling)
	{
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		if (( scaling == null )) 
		{
			//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			scaling = new haxe.at.dotpoint.math.vector.Vector2(10, 10);
		}
		
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.scaleFactor = scaling;
		//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		int w = 0;
		//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x = dimension.get_x();
			//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			w = ((int) (x) );
		}
		
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		int h = 0;
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x1 = dimension.get_y();
			//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			h = ((int) (x1) );
		}
		
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		java.awt.image.BufferedImage canvas_img = new java.awt.image.BufferedImage(w, h, java.awt.image.BufferedImage.TYPE_INT_ARGB);
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		javax.swing.JLabel canvas_jla = new javax.swing.JLabel(((javax.swing.Icon) (new javax.swing.ImageIcon(((java.awt.Image) (canvas_img) ))) ));
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		canvas_jla.setBounds(((int) (0) ), ((int) (0) ), ((int) (w) ), ((int) (h) ));
		//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas = ((java.awt.Graphics2D) (canvas_img.getGraphics()) );
		//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.setOpaque(haxe.lang.Runtime.toBool(false));
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.add(((java.awt.Component) (canvas_jla) ));
	}
	
	
	public void clear()
	{
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.setBackground(((java.awt.Color) (new java.awt.Color(((int) (255) ), ((int) (255) ), ((int) (255) ), ((int) (0) ))) ));
		//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.clearRect(((int) (0) ), ((int) (0) ), ((int) (this.getWidth()) ), ((int) (this.getHeight()) ));
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.repaint();
	}
	
	
	public void drawRectangle(haxe.at.dotpoint.math.geom.IRectangle rect, java.lang.Object color, java.lang.Object thickness, java.lang.Object alpha)
	{
		//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		java.lang.Object __temp_alpha151 = ( (haxe.lang.Runtime.eq(alpha, null)) ? (((java.lang.Object) (0.8) )) : (alpha) );
		//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		java.lang.Object __temp_thickness150 = ( (haxe.lang.Runtime.eq(thickness, null)) ? (((java.lang.Object) (1) )) : (thickness) );
		//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		java.lang.Object __temp_color149 = ( (haxe.lang.Runtime.eq(color, null)) ? (((java.lang.Object) (0) )) : (color) );
		//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.setRenderingHint(((java.awt.RenderingHints.Key) (java.awt.RenderingHints.KEY_ANTIALIASING) ), ((java.lang.Object) (java.awt.RenderingHints.VALUE_ANTIALIAS_ON) ));
		//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		haxe.at.dotpoint.math.vector.Vector3 cv = haxe.at.dotpoint.math.color.ColorUtil.toVector(((int) (haxe.lang.Runtime.toInt(__temp_color149)) ), null, null);
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double value = ((double) (haxe.lang.Runtime.toDouble(__temp_alpha151)) );
			//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			cv.w = value;
		}
		
		//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.setStroke(((java.awt.Stroke) (new java.awt.BasicStroke(((float) (( ((double) (haxe.lang.Runtime.toDouble(__temp_thickness150)) ) * ((double) (0.7) ) )) ), java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_MITER)) ));
		//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.setColor(((java.awt.Color) (new java.awt.Color(((float) (cv.x) ), ((float) (cv.y) ), ((float) (cv.z) ), ((float) (1) ))) ));
		//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		int x = 0;
		//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x1 = ( rect.get_min().get_x() * this.scaleFactor.get_x() );
			//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			x = ((int) (x1) );
		}
		
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		int y = 0;
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x2 = ( rect.get_min().get_y() * this.scaleFactor.get_y() );
			//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			y = ((int) (x2) );
		}
		
		//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		int w = 0;
		//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x3 = ( rect.get_width() * this.scaleFactor.get_x() );
			//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			w = ((int) (x3) );
		}
		
		//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		int h = 0;
		//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x4 = ( rect.get_height() * this.scaleFactor.get_y() );
			//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			h = ((int) (x4) );
		}
		
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.drawRect(((int) (x) ), ((int) (y) ), ((int) (w) ), ((int) (h) ));
		//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.setColor(((java.awt.Color) (new java.awt.Color(((float) (cv.x) ), ((float) (cv.y) ), ((float) (cv.z) ), ((float) (cv.w) ))) ));
		//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.fillRect(((int) (x) ), ((int) (y) ), ((int) (w) ), ((int) (h) ));
	}
	
	
	public void drawLabel(java.lang.String value, haxe.at.dotpoint.math.vector.IVector2 position, java.lang.Object size, java.lang.Object color)
	{
		//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		java.lang.Object __temp_size152 = ( (haxe.lang.Runtime.eq(size, null)) ? (((java.lang.Object) (25) )) : (size) );
		//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.setRenderingHint(((java.awt.RenderingHints.Key) (java.awt.RenderingHints.KEY_ANTIALIASING) ), ((java.lang.Object) (java.awt.RenderingHints.VALUE_ANTIALIAS_ON) ));
		//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		haxe.at.dotpoint.math.vector.Vector3 cv = haxe.at.dotpoint.math.color.ColorUtil.toVector(((int) (haxe.lang.Runtime.toInt(color)) ), null, null);
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		cv.w = ((double) (1) );
		//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		int x = 0;
		//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x1 = ( ( position.get_x() * this.scaleFactor.get_x() ) - 10 );
			//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			x = ((int) (x1) );
		}
		
		//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		int y = 0;
		//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x2 = ( ( position.get_y() * this.scaleFactor.get_y() ) + 5 );
			//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			y = ((int) (x2) );
		}
		
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.setColor(((java.awt.Color) (new java.awt.Color(((float) (cv.x) ), ((float) (cv.y) ), ((float) (cv.z) ), ((float) (cv.w) ))) ));
		//line 149 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.drawString(haxe.lang.Runtime.toString(value), ((int) (x) ), ((int) (y) ));
	}
	
	
	public void drawLine(haxe.at.dotpoint.math.vector.IVector2 a, haxe.at.dotpoint.math.vector.IVector2 b, java.lang.Object color, java.lang.Object thickness, java.lang.Object alpha)
	{
		//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.setRenderingHint(((java.awt.RenderingHints.Key) (java.awt.RenderingHints.KEY_ANTIALIASING) ), ((java.lang.Object) (java.awt.RenderingHints.VALUE_ANTIALIAS_ON) ));
		//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		haxe.at.dotpoint.math.vector.Vector3 cv = haxe.at.dotpoint.math.color.ColorUtil.toVector(((int) (haxe.lang.Runtime.toInt(color)) ), null, null);
		//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double value = ((double) (haxe.lang.Runtime.toDouble(alpha)) );
			//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			cv.w = value;
		}
		
		//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.setStroke(((java.awt.Stroke) (new java.awt.BasicStroke(((float) (( ((double) (haxe.lang.Runtime.toDouble(thickness)) ) * ((double) (0.7) ) )) ), java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_MITER)) ));
		//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.setColor(((java.awt.Color) (new java.awt.Color(((float) (cv.x) ), ((float) (cv.y) ), ((float) (cv.z) ), ((float) (cv.w) ))) ));
		//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double ax = 0.0;
		//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x = ( a.get_x() * this.scaleFactor.get_x() );
			//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			ax = ((double) (((int) (x) )) );
		}
		
		//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double ay = 0.0;
		//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x1 = ( a.get_y() * this.scaleFactor.get_y() );
			//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			ay = ((double) (((int) (x1) )) );
		}
		
		//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double bx = 0.0;
		//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x2 = ( b.get_x() * this.scaleFactor.get_x() );
			//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			bx = ((double) (((int) (x2) )) );
		}
		
		//line 177 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double by = 0.0;
		//line 177 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 177 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			double x3 = ( b.get_y() * this.scaleFactor.get_y() );
			//line 177 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			by = ((double) (((int) (x3) )) );
		}
		
		//line 181 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double dx = ( bx - ax );
		//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double dy = ( by - ay );
		//line 183 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double dd = java.lang.Math.sqrt(( ( dx * dx ) + ( dy * dy ) ));
		//line 185 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double xm = ( dd - ( ((int) (haxe.lang.Runtime.toInt(thickness)) ) * ((int) (2) ) ) );
		//line 186 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double xn = ( dd - ( ((int) (haxe.lang.Runtime.toInt(thickness)) ) * ((int) (2) ) ) );
		//line 188 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double ym = ((double) (( ((int) (haxe.lang.Runtime.toInt(thickness)) ) * ((int) (2) ) )) );
		//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double yn = ((double) (( ( - (((int) (haxe.lang.Runtime.toInt(thickness)) )) ) * 2 )) );
		//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double sin = ( dy / dd );
		//line 192 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double cos = ( dx / dd );
		//line 196 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double x0 = ( ( ( xm * cos ) - ( ym * sin ) ) + ax );
		//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double y0 = ( ( ( xm * sin ) + ( ym * cos ) ) + ay );
		//line 199 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double x11 = ( ( ( xn * cos ) - ( yn * sin ) ) + ax );
		//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		double y1 = ( ( ( xn * sin ) + ( yn * cos ) ) + ay );
		//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		int[] xpoints = ((int[]) (new int[]{((int) (bx) ), ((int) (x0) ), ((int) (x11) )}) );
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		int[] ypoints = ((int[]) (new int[]{((int) (by) ), ((int) (y0) ), ((int) (y1) )}) );
		//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.drawLine(((int) (ax) ), ((int) (ay) ), ((int) (bx) ), ((int) (by) ));
		//line 208 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		this.canvas.fillPolygon(((int[]) (xpoints) ), ((int[]) (ypoints) ), ((int) (3) ));
	}
	
	
	public boolean __hx_deleteField(java.lang.String field)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		return false;
	}
	
	
	public java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		if (isCheck) 
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			if (throwErrors) 
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
				throw haxe.lang.HaxeException.wrap("Field not found.");
			}
			else
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
				return null;
			}
			
		}
		
	}
	
	
	public double __hx_lookupField_f(java.lang.String field, boolean throwErrors)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		if (throwErrors) 
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			throw haxe.lang.HaxeException.wrap("Field not found or incompatible field type.");
		}
		else
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			return 0.0;
		}
		
	}
	
	
	public java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing.");
	}
	
	
	public double __hx_lookupSetField_f(java.lang.String field, double value)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing or incompatible type.");
	}
	
	
	public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
				return this.__hx_lookupSetField_f(field, value);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			switch (field.hashCode())
			{
				case -61228775:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("accessibleContext")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.accessibleContext = ((javax.accessibility.AccessibleContext) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 102749521:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("layer")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.layer = ((javax.swing.JLayeredPane) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1505267854:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("listenerList")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.listenerList = ((javax.swing.event.EventListenerList) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1367706280:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("canvas")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.canvas = ((java.awt.Graphics2D) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 3732:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("ui")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.ui = ((javax.swing.plaf.ComponentUI) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1210167495:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("scaleFactor")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.scaleFactor = ((haxe.at.dotpoint.math.vector.IVector2) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
			}
			
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
				return this.__hx_lookupSetField(field, value);
			}
			else
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			switch (field.hashCode())
			{
				case -75308287:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getName")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getName")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 102749521:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("layer")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return this.layer;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1984801293:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setName")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setName")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1367706280:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("canvas")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return this.canvas;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 700591008:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getParent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getParent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1210167495:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("scaleFactor")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return this.scaleFactor;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -75245096:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getPeer")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPeer")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("initialize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initialize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1406034786:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setDropTarget")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setDropTarget")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 94746189:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("clear")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clear")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 631903574:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getDropTarget")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getDropTarget")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1264405643:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("drawRectangle")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "drawRectangle")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1406043765:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getGraphicsConfiguration")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getGraphicsConfiguration")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 128650256:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("drawLabel")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "drawLabel")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -831132833:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getTreeLock")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTreeLock")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -827125928:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("drawLine")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "drawLine")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -103224824:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getToolkit")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getToolkit")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1334722659:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getAccessibleContext")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getAccessibleContext")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 2073378034:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isValid")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isValid")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 820971262:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("paramString")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "paramString")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 304683410:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isDisplayable")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isDisplayable")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -133970743:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getUIClassID")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUIClassID")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -113035288:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isVisible")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isVisible")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 109327990:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setUI")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setUI")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1487521595:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isShowing")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isShowing")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 98245738:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getUI")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUI")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 2105594551:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isEnabled")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isEnabled")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1322595613:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("updateUI")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "updateUI")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -174300757:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("enableInputMethods")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "enableInputMethods")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1910920416:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getRootPane")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getRootPane")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 3529469:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("show")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "show")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 116955034:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isDoubleBuffered")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isDoubleBuffered")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 3202370:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("hide")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hide")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 383468754:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setDoubleBuffered")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setDoubleBuffered")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1686708537:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getForeground")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getForeground")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1356268992:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("paintImmediately")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "paintImmediately")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 902956821:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isForegroundSet")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isForegroundSet")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -209888556:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isPaintingOrigin")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isPaintingOrigin")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1629942492:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getBackground")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBackground")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1444703808:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isOptimizedDrawingEnabled")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isOptimizedDrawingEnabled")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 274796362:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isBackgroundSet")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isBackgroundSet")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 319849826:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isValidateRoot")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isValidateRoot")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -75533115:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getFont")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFont")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -218282935:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("revalidate")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "revalidate")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1260721911:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isFontSet")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isFontSet")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1094177291:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("repaint")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "repaint")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 598552912:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getLocale")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getLocale")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1001125651:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeNotify")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeNotify")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 383935836:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setLocale")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setLocale")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -146849974:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addNotify")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addNotify")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 975157628:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getColorModel")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getColorModel")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1228323959:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 204504438:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getLocationOnScreen")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getLocationOnScreen")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -727692042:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getAncestorListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getAncestorListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1901043637:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("location")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "location")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1567628213:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeAncestorListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeAncestorListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 3357649:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("move")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "move")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1065055640:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addAncestorListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addAncestorListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -404603337:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setLocation")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setLocation")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -701878888:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getTopLevelAncestor")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTopLevelAncestor")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("size")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "size")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -637180459:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getVetoableChangeListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getVetoableChangeListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1984958339:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setSize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setSize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1422550772:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeVetoableChangeListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeVetoableChangeListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -934437708:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("resize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -894798487:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addVetoableChangeListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addVetoableChangeListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1383205195:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("bounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "bounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -800831894:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("fireVetoableChange")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "fireVetoableChange")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 98192823:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2036853317:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("firePropertyChange")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "firePropertyChange")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1387686788:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isLightweight")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isLightweight")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -509772736:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getVisibleRect")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getVisibleRect")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1787544022:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isPreferredSizeSet")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isPreferredSizeSet")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 456055999:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("computeVisibleRect")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "computeVisibleRect")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -400630659:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isMinimumSizeSet")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isMinimumSizeSet")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 470702883:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setOpaque")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setOpaque")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1057546709:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isMaximumSizeSet")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isMaximumSizeSet")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -336661013:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isOpaque")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isOpaque")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 132278872:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setCursor")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setCursor")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 474985501:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getHeight")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getHeight")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 346895948:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getCursor")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getCursor")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1968952336:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getWidth")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getWidth")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1873980194:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isCursorSet")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isCursorSet")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 3169219:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getY")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getY")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 925942883:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("paintAll")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "paintAll")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 3169218:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getX")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getX")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2066473468:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("imageUpdate")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "imageUpdate")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -316023509:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getLocation")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getLocation")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -514107969:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("createImage")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createImage")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -75151241:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getSize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getSize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -746920573:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("createVolatileImage")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createVolatileImage")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 312809899:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2048673644:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("prepareImage")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "prepareImage")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1097148750:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("reshape")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "reshape")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -538855117:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("checkImage")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "checkImage")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1635067428:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setFocusTraversalKeys")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setFocusTraversalKeys")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -917848425:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setIgnoreRepaint")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setIgnoreRepaint")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1425362001:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("putClientProperty")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "putClientProperty")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 913594403:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getIgnoreRepaint")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getIgnoreRepaint")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1141635146:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getClientProperty")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getClientProperty")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1183789060:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("inside")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "inside")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1671308008:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("disable")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "disable")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2140931520:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("dispatchEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatchEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1298848381:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("enable")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "enable")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1979010522:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("postEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "postEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 2065058606:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processMouseMotionEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processMouseMotionEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -737348048:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addComponentListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addComponentListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 786391236:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processMouseEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processMouseEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 862771373:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeComponentListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeComponentListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1683315369:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getTransferHandler")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTransferHandler")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1150319688:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getComponentListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponentListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1691618275:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setTransferHandler")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setTransferHandler")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2091996533:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addFocusListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addFocusListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1769313919:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getAutoscrolls")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getAutoscrolls")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2007673976:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeFocusListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeFocusListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 753917173:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setAutoscrolls")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setAutoscrolls")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1237998909:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getFocusListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFocusListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 954363430:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("scrollRectToVisible")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "scrollRectToVisible")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 675525480:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addHierarchyListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addHierarchyListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1106410311:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("createToolTip")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createToolTip")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2019322395:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeHierarchyListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeHierarchyListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1988967221:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getPopupLocation")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPopupLocation")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -300913280:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getHierarchyListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getHierarchyListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1795253630:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getToolTipLocation")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getToolTipLocation")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 875541053:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addHierarchyBoundsListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addHierarchyBoundsListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1862577786:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getToolTipText")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getToolTipText")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1695089402:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeHierarchyBoundsListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeHierarchyBoundsListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 90841582:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setToolTipText")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setToolTipText")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -292872821:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getHierarchyBoundsListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getHierarchyBoundsListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 69241589:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processKeyBinding")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processKeyBinding")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 705046738:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addKeyListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addKeyListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 2139532042:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processKeyEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processKeyEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 2108484879:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeKeyListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeKeyListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1312303337:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processComponentKeyEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processComponentKeyEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -68050666:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getKeyListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getKeyListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1984576465:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setFont")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setFont")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 2091349336:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addMouseListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addMouseListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -855811280:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setBackground")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setBackground")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2119295403:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeMouseListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeMouseListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1834127547:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setForeground")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setForeground")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 2072701968:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getMouseListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getMouseListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1364071551:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setEnabled")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setEnabled")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -83462098:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addMouseMotionListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addMouseMotionListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -854558288:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setVisible")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setVisible")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 33009515:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeMouseMotionListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeMouseMotionListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1253361850:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("requestDefaultFocus")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "requestDefaultFocus")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1929852986:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getMouseMotionListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getMouseMotionListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2053764159:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getBaselineResizeBehavior")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBaselineResizeBehavior")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1910206219:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addMouseWheelListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addMouseWheelListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 357114811:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getBaseline")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBaseline")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -25699282:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeMouseWheelListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeMouseWheelListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 188673168:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getActionMap")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getActionMap")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 2003512819:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getMouseWheelListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getMouseWheelListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1737665796:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setActionMap")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setActionMap")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1026988866:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addInputMethodListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addInputMethodListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1746368856:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getInputMap")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getInputMap")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -910517253:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeInputMethodListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeInputMethodListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1834948684:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setInputMap")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setInputMap")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1549673046:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getInputMethodListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getInputMethodListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1777533497:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("resetKeyboardActions")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resetKeyboardActions")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 150256377:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getInputMethodRequests")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getInputMethodRequests")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1337788934:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getActionForKeyStroke")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getActionForKeyStroke")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -730558213:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getInputContext")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getInputContext")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2016664141:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getConditionForKeyStroke")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getConditionForKeyStroke")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2086501252:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("enableEvents")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "enableEvents")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -760205708:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getRegisteredKeyStrokes")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getRegisteredKeyStrokes")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1240522207:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("disableEvents")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "disableEvents")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1167238055:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("unregisterKeyboardAction")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unregisterKeyboardAction")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 23978912:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("coalesceEvents")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "coalesceEvents")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1402521984:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("registerKeyboardAction")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "registerKeyboardAction")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1944745964:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processComponentEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processComponentEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 852008758:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getDebugGraphicsOptions")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getDebugGraphicsOptions")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1262981007:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processFocusEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processFocusEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1390686654:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setDebugGraphicsOptions")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setDebugGraphicsOptions")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1880947691:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processMouseWheelEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processMouseWheelEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2116360191:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getGraphics")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getGraphics")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 2117937310:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processInputMethodEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processInputMethodEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1695427850:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getInputVerifier")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getInputVerifier")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 584549812:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processHierarchyEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processHierarchyEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -136014978:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setInputVerifier")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setInputVerifier")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2051715969:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processHierarchyBoundsEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processHierarchyBoundsEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -554065705:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setAlignmentX")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setAlignmentX")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1469558098:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("handleEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "handleEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1328196917:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getAlignmentX")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getAlignmentX")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 585890535:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("mouseDown")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "mouseDown")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -554065704:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setAlignmentY")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setAlignmentY")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 585892729:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("mouseDrag")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "mouseDrag")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1328196916:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getAlignmentY")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getAlignmentY")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1243066912:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("mouseUp")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "mouseUp")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 512222700:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getInsets")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getInsets")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 586158614:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("mouseMove")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "mouseMove")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 312710946:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getBorder")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBorder")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 983628083:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("mouseEnter")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "mouseEnter")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 98093870:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setBorder")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setBorder")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 585928547:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("mouseExit")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "mouseExit")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -567445985:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("contains")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "contains")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -815927391:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("keyDown")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "keyDown")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 367948793:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getMinimumSize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getMinimumSize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 101944666:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("keyUp")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "keyUp")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1403787411:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setMinimumSize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setMinimumSize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1422950858:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("action")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "action")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1045381387:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getMaximumSize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getMaximumSize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2056434772:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("gotFocus")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "gotFocus")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -726354817:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setMaximumSize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setMaximumSize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 619607060:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("lostFocus")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lostFocus")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1726352276:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getPreferredSize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPreferredSize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1426705793:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isFocusTraversable")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isFocusTraversable")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 737172192:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setPreferredSize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setPreferredSize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1487536088:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isFocusable")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isFocusable")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 2087644222:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getFontMetrics")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFontMetrics")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1126567952:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setFocusable")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setFocusable")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1816942124:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getVerifyInputWhenFocusTarget")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getVerifyInputWhenFocusTarget")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -100025915:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setFocusTraversalKeysEnabled")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setFocusTraversalKeysEnabled")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2089656352:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setVerifyInputWhenFocusTarget")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setVerifyInputWhenFocusTarget")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1338154671:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getFocusTraversalKeysEnabled")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFocusTraversalKeysEnabled")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1605080596:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("grabFocus")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "grabFocus")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 564387289:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getFocusCycleRootAncestor")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFocusCycleRootAncestor")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -132373474:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("requestFocusInWindow")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "requestFocusInWindow")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -2037192787:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("transferFocus")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "transferFocus")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1280029577:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("requestFocus")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "requestFocus")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1193982373:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("nextFocus")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "nextFocus")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -375268882:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isRequestFocusEnabled")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isRequestFocusEnabled")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1229986480:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("transferFocusBackward")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "transferFocusBackward")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 217231286:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setRequestFocusEnabled")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setRequestFocusEnabled")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 122660510:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("transferFocusUpCycle")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "transferFocusUpCycle")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 413687348:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getNextFocusableComponent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getNextFocusableComponent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 117596766:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("hasFocus")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasFocus")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1256979008:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setNextFocusableComponent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setNextFocusableComponent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1115025797:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isFocusOwner")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isFocusOwner")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 890536972:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isManagingFocus")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isManagingFocus")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1776922004:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("toString")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -770686062:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isPaintingForPrint")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isPaintingForPrint")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1645115555:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removePropertyChangeListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removePropertyChangeListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 142938588:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isPaintingTile")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isPaintingTile")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1053245860:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getPropertyChangeListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPropertyChangeListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -824599239:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("printBorder")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "printBorder")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1920162837:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setComponentOrientation")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setComponentOrientation")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1704032204:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("printChildren")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "printChildren")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -132109047:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getComponentOrientation")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponentOrientation")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -20235056:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("printComponent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "printComponent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1052288776:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getComponentCount")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponentCount")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 106934957:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("print")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "print")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -754783867:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("countComponents")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "countComponents")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1166363724:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("printAll")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "printAll")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1409511865:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getComponent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 106428510:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("paint")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "paint")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -745194740:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getComponents")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponents")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -838846263:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("update")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "update")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1183792394:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("insets")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "insets")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1778836950:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("paintBorder")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "paintBorder")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -189934193:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setComponentZOrder")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setComponentZOrder")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -490374019:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("paintChildren")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "paintChildren")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1109967845:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getComponentZOrder")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponentZOrder")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 672648767:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("paintComponent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "paintComponent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("add")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 241460722:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getComponentGraphics")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponentGraphics")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1148905887:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addImpl")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addImpl")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -547981916:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getComponentPopupMenu")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponentPopupMenu")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("remove")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1988229040:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setComponentPopupMenu")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setComponentPopupMenu")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1282345597:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeAll")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeAll")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -658829443:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getInheritsPopupMenu")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getInheritsPopupMenu")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 586292768:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getLayout")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getLayout")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1269752847:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setInheritsPopupMenu")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setInheritsPopupMenu")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 371675692:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setLayout")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setLayout")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 3732:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("ui")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return this.ui;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 185147285:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("doLayout")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "doLayout")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1505267854:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("listenerList")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return this.listenerList;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1109722326:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("layout")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "layout")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -61228775:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("accessibleContext")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return this.accessibleContext;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1831849669:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("invalidate")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidate")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1117363270:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addPropertyChangeListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addPropertyChangeListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1421272810:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("validate")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validate")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -679533279:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("applyComponentOrientation")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "applyComponentOrientation")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1081247188:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("validateTree")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateTree")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -606755785:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("transferFocusDownCycle")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "transferFocusDownCycle")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -608552926:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("preferredSize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "preferredSize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1708753933:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isFocusTraversalPolicyProvider")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isFocusTraversalPolicyProvider")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1008217391:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("minimumSize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "minimumSize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 626370347:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setFocusTraversalPolicyProvider")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setFocusTraversalPolicyProvider")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -622724588:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("paintComponents")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "paintComponents")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -311299910:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isFocusCycleRoot")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isFocusCycleRoot")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -627286621:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("printComponents")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "printComponents")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -44786190:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setFocusCycleRoot")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setFocusCycleRoot")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 11100596:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("addContainerListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addContainerListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 602541344:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isFocusTraversalPolicySet")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isFocusTraversalPolicySet")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1611220017:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("removeContainerListener")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeContainerListener")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1242052594:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getFocusTraversalPolicy")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFocusTraversalPolicy")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 576751796:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getContainerListeners")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getContainerListeners")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 810219290:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("setFocusTraversalPolicy")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setFocusTraversalPolicy")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1969426795:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -355296716:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("areFocusTraversalKeysSet")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "areFocusTraversalKeysSet")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1430084328:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("processContainerEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "processContainerEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 123688912:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getFocusTraversalKeys")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFocusTraversalKeys")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 634939509:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("deliverEvent")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "deliverEvent")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 3322014:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("list")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "list")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1097461934:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("locate")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "locate")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1671141420:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("isAncestorOf")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isAncestorOf")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -1626201894:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getComponentAt")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponentAt")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 398126743:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("findComponentAt")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "findComponentAt")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 438337848:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("getMousePosition")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getMousePosition")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
			}
			
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
				return this.__hx_lookupField(field, throwErrors, isCheck);
			}
			else
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
				return this.__hx_lookupField_f(field, throwErrors);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			int __temp_hash2 = field.hashCode();
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			switch (__temp_hash2)
			{
				case -75308287:
				case 1984801293:
				case 700591008:
				case -75245096:
				case 1406034786:
				case 631903574:
				case 1406043765:
				case -831132833:
				case -103224824:
				case 2073378034:
				case 304683410:
				case -113035288:
				case 1487521595:
				case 2105594551:
				case -174300757:
				case 3529469:
				case 3202370:
				case 1686708537:
				case 902956821:
				case -1629942492:
				case 274796362:
				case -75533115:
				case -1260721911:
				case 598552912:
				case 383935836:
				case 975157628:
				case 204504438:
				case 1901043637:
				case 3357649:
				case -404603337:
				case 3530753:
				case 1984958339:
				case -934437708:
				case -1383205195:
				case 98192823:
				case 1387686788:
				case -1787544022:
				case -400630659:
				case -1057546709:
				case 132278872:
				case 346895948:
				case 1873980194:
				case 925942883:
				case -2066473468:
				case -514107969:
				case -746920573:
				case -2048673644:
				case -538855117:
				case -917848425:
				case 913594403:
				case -1183789060:
				case -2140931520:
				case 1979010522:
				case -737348048:
				case 862771373:
				case -1150319688:
				case -2091996533:
				case -2007673976:
				case 1237998909:
				case 675525480:
				case -2019322395:
				case -300913280:
				case 875541053:
				case 1695089402:
				case -292872821:
				case 705046738:
				case 2108484879:
				case -68050666:
				case 2091349336:
				case -2119295403:
				case 2072701968:
				case -83462098:
				case 33009515:
				case 1929852986:
				case 1910206219:
				case -25699282:
				case 2003512819:
				case -1026988866:
				case -910517253:
				case -1549673046:
				case 150256377:
				case -730558213:
				case -2086501252:
				case -1240522207:
				case 23978912:
				case 1944745964:
				case -1262981007:
				case -1880947691:
				case 2117937310:
				case 584549812:
				case -2051715969:
				case 1469558098:
				case 585890535:
				case 585892729:
				case 1243066912:
				case 586158614:
				case 983628083:
				case 585928547:
				case -815927391:
				case 101944666:
				case -1422950858:
				case -2056434772:
				case 619607060:
				case -1426705793:
				case -1487536088:
				case -1126567952:
				case -100025915:
				case -1338154671:
				case 564387289:
				case -2037192787:
				case 1193982373:
				case 1229986480:
				case 122660510:
				case 117596766:
				case 1115025797:
				case -1776922004:
				case -1645115555:
				case 1053245860:
				case 1920162837:
				case -132109047:
				case 1052288776:
				case -754783867:
				case -1409511865:
				case -745194740:
				case -1183792394:
				case -189934193:
				case -1109967845:
				case 96417:
				case -1148905887:
				case -934610812:
				case 1282345597:
				case 586292768:
				case 371675692:
				case 185147285:
				case -1109722326:
				case -1831849669:
				case -1421272810:
				case 1081247188:
				case -608552926:
				case 1008217391:
				case -622724588:
				case -627286621:
				case 11100596:
				case 1611220017:
				case 576751796:
				case 1969426795:
				case 1430084328:
				case 634939509:
				case -1097461934:
				case -1626201894:
				case 438337848:
				case 398126743:
				case -1671141420:
				case 3322014:
				case 123688912:
				case -355296716:
				case 810219290:
				case -1242052594:
				case 602541344:
				case -44786190:
				case -311299910:
				case 626370347:
				case -1708753933:
				case -606755785:
				case -679533279:
				case -1117363270:
				case -1269752847:
				case -658829443:
				case 1988229040:
				case -547981916:
				case 241460722:
				case 672648767:
				case -490374019:
				case -1778836950:
				case -838846263:
				case 106428510:
				case -1166363724:
				case 106934957:
				case -20235056:
				case 1704032204:
				case -824599239:
				case 142938588:
				case -770686062:
				case 890536972:
				case 1256979008:
				case 413687348:
				case 217231286:
				case -375268882:
				case 1280029577:
				case -132373474:
				case -1605080596:
				case -2089656352:
				case -1816942124:
				case 2087644222:
				case 737172192:
				case -1726352276:
				case -726354817:
				case 1045381387:
				case -1403787411:
				case 367948793:
				case -567445985:
				case 98093870:
				case 312710946:
				case 512222700:
				case -1328196916:
				case -554065704:
				case -1328196917:
				case -554065705:
				case -136014978:
				case 1695427850:
				case -2116360191:
				case -1390686654:
				case 852008758:
				case -1402521984:
				case -1167238055:
				case -760205708:
				case -2016664141:
				case -1337788934:
				case -1777533497:
				case -1834948684:
				case -1746368856:
				case 1737665796:
				case 188673168:
				case 357114811:
				case -2053764159:
				case -1253361850:
				case -854558288:
				case 1364071551:
				case -1834127547:
				case -855811280:
				case 1984576465:
				case 1312303337:
				case 2139532042:
				case 69241589:
				case 90841582:
				case 1862577786:
				case -1795253630:
				case -1988967221:
				case 1106410311:
				case 954363430:
				case 753917173:
				case -1769313919:
				case -1691618275:
				case 1683315369:
				case 786391236:
				case 2065058606:
				case -1298848381:
				case 1671308008:
				case -1141635146:
				case -1425362001:
				case -1635067428:
				case 1097148750:
				case 312809899:
				case -75151241:
				case -316023509:
				case 3169218:
				case 3169219:
				case 1968952336:
				case 474985501:
				case -336661013:
				case 470702883:
				case 456055999:
				case -509772736:
				case -2036853317:
				case -800831894:
				case -894798487:
				case -1422550772:
				case -637180459:
				case -701878888:
				case -1065055640:
				case -1567628213:
				case -727692042:
				case -1228323959:
				case -146849974:
				case -1001125651:
				case 1094177291:
				case -218282935:
				case 319849826:
				case -1444703808:
				case -209888556:
				case 1356268992:
				case 383468754:
				case 116955034:
				case 1910920416:
				case 1322595613:
				case 98245738:
				case 109327990:
				case -133970743:
				case 820971262:
				case 1334722659:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (( (( ( __temp_hash2 == -75308287 ) && field.equals("getName") )) || ( (( ( __temp_hash2 == 1984801293 ) && field.equals("setName") )) || ( (( ( __temp_hash2 == 700591008 ) && field.equals("getParent") )) || ( (( ( __temp_hash2 == -75245096 ) && field.equals("getPeer") )) || ( (( ( __temp_hash2 == 1406034786 ) && field.equals("setDropTarget") )) || ( (( ( __temp_hash2 == 631903574 ) && field.equals("getDropTarget") )) || ( (( ( __temp_hash2 == 1406043765 ) && field.equals("getGraphicsConfiguration") )) || ( (( ( __temp_hash2 == -831132833 ) && field.equals("getTreeLock") )) || ( (( ( __temp_hash2 == -103224824 ) && field.equals("getToolkit") )) || ( (( ( __temp_hash2 == 2073378034 ) && field.equals("isValid") )) || ( (( ( __temp_hash2 == 304683410 ) && field.equals("isDisplayable") )) || ( (( ( __temp_hash2 == -113035288 ) && field.equals("isVisible") )) || ( (( ( __temp_hash2 == 1487521595 ) && field.equals("isShowing") )) || ( (( ( __temp_hash2 == 2105594551 ) && field.equals("isEnabled") )) || ( (( ( __temp_hash2 == -174300757 ) && field.equals("enableInputMethods") )) || ( (( ( __temp_hash2 == 3529469 ) && field.equals("show") )) || ( (( ( __temp_hash2 == 3202370 ) && field.equals("hide") )) || ( (( ( __temp_hash2 == 1686708537 ) && field.equals("getForeground") )) || ( (( ( __temp_hash2 == 902956821 ) && field.equals("isForegroundSet") )) || ( (( ( __temp_hash2 == -1629942492 ) && field.equals("getBackground") )) || ( (( ( __temp_hash2 == 274796362 ) && field.equals("isBackgroundSet") )) || ( (( ( __temp_hash2 == -75533115 ) && field.equals("getFont") )) || ( (( ( __temp_hash2 == -1260721911 ) && field.equals("isFontSet") )) || ( (( ( __temp_hash2 == 598552912 ) && field.equals("getLocale") )) || ( (( ( __temp_hash2 == 383935836 ) && field.equals("setLocale") )) || ( (( ( __temp_hash2 == 975157628 ) && field.equals("getColorModel") )) || ( (( ( __temp_hash2 == 204504438 ) && field.equals("getLocationOnScreen") )) || ( (( ( __temp_hash2 == 1901043637 ) && field.equals("location") )) || ( (( ( __temp_hash2 == 3357649 ) && field.equals("move") )) || ( (( ( __temp_hash2 == -404603337 ) && field.equals("setLocation") )) || ( (( ( __temp_hash2 == 3530753 ) && field.equals("size") )) || ( (( ( __temp_hash2 == 1984958339 ) && field.equals("setSize") )) || ( (( ( __temp_hash2 == -934437708 ) && field.equals("resize") )) || ( (( ( __temp_hash2 == -1383205195 ) && field.equals("bounds") )) || ( (( ( __temp_hash2 == 98192823 ) && field.equals("setBounds") )) || ( (( ( __temp_hash2 == 1387686788 ) && field.equals("isLightweight") )) || ( (( ( __temp_hash2 == -1787544022 ) && field.equals("isPreferredSizeSet") )) || ( (( ( __temp_hash2 == -400630659 ) && field.equals("isMinimumSizeSet") )) || ( (( ( __temp_hash2 == -1057546709 ) && field.equals("isMaximumSizeSet") )) || ( (( ( __temp_hash2 == 132278872 ) && field.equals("setCursor") )) || ( (( ( __temp_hash2 == 346895948 ) && field.equals("getCursor") )) || ( (( ( __temp_hash2 == 1873980194 ) && field.equals("isCursorSet") )) || ( (( ( __temp_hash2 == 925942883 ) && field.equals("paintAll") )) || ( (( ( __temp_hash2 == -2066473468 ) && field.equals("imageUpdate") )) || ( (( ( __temp_hash2 == -514107969 ) && field.equals("createImage") )) || ( (( ( __temp_hash2 == -746920573 ) && field.equals("createVolatileImage") )) || ( (( ( __temp_hash2 == -2048673644 ) && field.equals("prepareImage") )) || ( (( ( __temp_hash2 == -538855117 ) && field.equals("checkImage") )) || ( (( ( __temp_hash2 == -917848425 ) && field.equals("setIgnoreRepaint") )) || ( (( ( __temp_hash2 == 913594403 ) && field.equals("getIgnoreRepaint") )) || ( (( ( __temp_hash2 == -1183789060 ) && field.equals("inside") )) || ( (( ( __temp_hash2 == -2140931520 ) && field.equals("dispatchEvent") )) || ( (( ( __temp_hash2 == 1979010522 ) && field.equals("postEvent") )) || ( (( ( __temp_hash2 == -737348048 ) && field.equals("addComponentListener") )) || ( (( ( __temp_hash2 == 862771373 ) && field.equals("removeComponentListener") )) || ( (( ( __temp_hash2 == -1150319688 ) && field.equals("getComponentListeners") )) || ( (( ( __temp_hash2 == -2091996533 ) && field.equals("addFocusListener") )) || ( (( ( __temp_hash2 == -2007673976 ) && field.equals("removeFocusListener") )) || ( (( ( __temp_hash2 == 1237998909 ) && field.equals("getFocusListeners") )) || ( (( ( __temp_hash2 == 675525480 ) && field.equals("addHierarchyListener") )) || ( (( ( __temp_hash2 == -2019322395 ) && field.equals("removeHierarchyListener") )) || ( (( ( __temp_hash2 == -300913280 ) && field.equals("getHierarchyListeners") )) || ( (( ( __temp_hash2 == 875541053 ) && field.equals("addHierarchyBoundsListener") )) || ( (( ( __temp_hash2 == 1695089402 ) && field.equals("removeHierarchyBoundsListener") )) || ( (( ( __temp_hash2 == -292872821 ) && field.equals("getHierarchyBoundsListeners") )) || ( (( ( __temp_hash2 == 705046738 ) && field.equals("addKeyListener") )) || ( (( ( __temp_hash2 == 2108484879 ) && field.equals("removeKeyListener") )) || ( (( ( __temp_hash2 == -68050666 ) && field.equals("getKeyListeners") )) || ( (( ( __temp_hash2 == 2091349336 ) && field.equals("addMouseListener") )) || ( (( ( __temp_hash2 == -2119295403 ) && field.equals("removeMouseListener") )) || ( (( ( __temp_hash2 == 2072701968 ) && field.equals("getMouseListeners") )) || ( (( ( __temp_hash2 == -83462098 ) && field.equals("addMouseMotionListener") )) || ( (( ( __temp_hash2 == 33009515 ) && field.equals("removeMouseMotionListener") )) || ( (( ( __temp_hash2 == 1929852986 ) && field.equals("getMouseMotionListeners") )) || ( (( ( __temp_hash2 == 1910206219 ) && field.equals("addMouseWheelListener") )) || ( (( ( __temp_hash2 == -25699282 ) && field.equals("removeMouseWheelListener") )) || ( (( ( __temp_hash2 == 2003512819 ) && field.equals("getMouseWheelListeners") )) || ( (( ( __temp_hash2 == -1026988866 ) && field.equals("addInputMethodListener") )) || ( (( ( __temp_hash2 == -910517253 ) && field.equals("removeInputMethodListener") )) || ( (( ( __temp_hash2 == -1549673046 ) && field.equals("getInputMethodListeners") )) || ( (( ( __temp_hash2 == 150256377 ) && field.equals("getInputMethodRequests") )) || ( (( ( __temp_hash2 == -730558213 ) && field.equals("getInputContext") )) || ( (( ( __temp_hash2 == -2086501252 ) && field.equals("enableEvents") )) || ( (( ( __temp_hash2 == -1240522207 ) && field.equals("disableEvents") )) || ( (( ( __temp_hash2 == 23978912 ) && field.equals("coalesceEvents") )) || ( (( ( __temp_hash2 == 1944745964 ) && field.equals("processComponentEvent") )) || ( (( ( __temp_hash2 == -1262981007 ) && field.equals("processFocusEvent") )) || ( (( ( __temp_hash2 == -1880947691 ) && field.equals("processMouseWheelEvent") )) || ( (( ( __temp_hash2 == 2117937310 ) && field.equals("processInputMethodEvent") )) || ( (( ( __temp_hash2 == 584549812 ) && field.equals("processHierarchyEvent") )) || ( (( ( __temp_hash2 == -2051715969 ) && field.equals("processHierarchyBoundsEvent") )) || ( (( ( __temp_hash2 == 1469558098 ) && field.equals("handleEvent") )) || ( (( ( __temp_hash2 == 585890535 ) && field.equals("mouseDown") )) || ( (( ( __temp_hash2 == 585892729 ) && field.equals("mouseDrag") )) || ( (( ( __temp_hash2 == 1243066912 ) && field.equals("mouseUp") )) || ( (( ( __temp_hash2 == 586158614 ) && field.equals("mouseMove") )) || ( (( ( __temp_hash2 == 983628083 ) && field.equals("mouseEnter") )) || ( (( ( __temp_hash2 == 585928547 ) && field.equals("mouseExit") )) || ( (( ( __temp_hash2 == -815927391 ) && field.equals("keyDown") )) || ( (( ( __temp_hash2 == 101944666 ) && field.equals("keyUp") )) || ( (( ( __temp_hash2 == -1422950858 ) && field.equals("action") )) || ( (( ( __temp_hash2 == -2056434772 ) && field.equals("gotFocus") )) || ( (( ( __temp_hash2 == 619607060 ) && field.equals("lostFocus") )) || ( (( ( __temp_hash2 == -1426705793 ) && field.equals("isFocusTraversable") )) || ( (( ( __temp_hash2 == -1487536088 ) && field.equals("isFocusable") )) || ( (( ( __temp_hash2 == -1126567952 ) && field.equals("setFocusable") )) || ( (( ( __temp_hash2 == -100025915 ) && field.equals("setFocusTraversalKeysEnabled") )) || ( (( ( __temp_hash2 == -1338154671 ) && field.equals("getFocusTraversalKeysEnabled") )) || ( (( ( __temp_hash2 == 564387289 ) && field.equals("getFocusCycleRootAncestor") )) || ( (( ( __temp_hash2 == -2037192787 ) && field.equals("transferFocus") )) || ( (( ( __temp_hash2 == 1193982373 ) && field.equals("nextFocus") )) || ( (( ( __temp_hash2 == 1229986480 ) && field.equals("transferFocusBackward") )) || ( (( ( __temp_hash2 == 122660510 ) && field.equals("transferFocusUpCycle") )) || ( (( ( __temp_hash2 == 117596766 ) && field.equals("hasFocus") )) || ( (( ( __temp_hash2 == 1115025797 ) && field.equals("isFocusOwner") )) || ( (( ( __temp_hash2 == -1776922004 ) && field.equals("toString") )) || ( (( ( __temp_hash2 == -1645115555 ) && field.equals("removePropertyChangeListener") )) || ( (( ( __temp_hash2 == 1053245860 ) && field.equals("getPropertyChangeListeners") )) || ( (( ( __temp_hash2 == 1920162837 ) && field.equals("setComponentOrientation") )) || ( (( ( __temp_hash2 == -132109047 ) && field.equals("getComponentOrientation") )) || ( (( ( __temp_hash2 == 1052288776 ) && field.equals("getComponentCount") )) || ( (( ( __temp_hash2 == -754783867 ) && field.equals("countComponents") )) || ( (( ( __temp_hash2 == -1409511865 ) && field.equals("getComponent") )) || ( (( ( __temp_hash2 == -745194740 ) && field.equals("getComponents") )) || ( (( ( __temp_hash2 == -1183792394 ) && field.equals("insets") )) || ( (( ( __temp_hash2 == -189934193 ) && field.equals("setComponentZOrder") )) || ( (( ( __temp_hash2 == -1109967845 ) && field.equals("getComponentZOrder") )) || ( (( ( __temp_hash2 == 96417 ) && field.equals("add") )) || ( (( ( __temp_hash2 == -1148905887 ) && field.equals("addImpl") )) || ( (( ( __temp_hash2 == -934610812 ) && field.equals("remove") )) || ( (( ( __temp_hash2 == 1282345597 ) && field.equals("removeAll") )) || ( (( ( __temp_hash2 == 586292768 ) && field.equals("getLayout") )) || ( (( ( __temp_hash2 == 371675692 ) && field.equals("setLayout") )) || ( (( ( __temp_hash2 == 185147285 ) && field.equals("doLayout") )) || ( (( ( __temp_hash2 == -1109722326 ) && field.equals("layout") )) || ( (( ( __temp_hash2 == -1831849669 ) && field.equals("invalidate") )) || ( (( ( __temp_hash2 == -1421272810 ) && field.equals("validate") )) || ( (( ( __temp_hash2 == 1081247188 ) && field.equals("validateTree") )) || ( (( ( __temp_hash2 == -608552926 ) && field.equals("preferredSize") )) || ( (( ( __temp_hash2 == 1008217391 ) && field.equals("minimumSize") )) || ( (( ( __temp_hash2 == -622724588 ) && field.equals("paintComponents") )) || ( (( ( __temp_hash2 == -627286621 ) && field.equals("printComponents") )) || ( (( ( __temp_hash2 == 11100596 ) && field.equals("addContainerListener") )) || ( (( ( __temp_hash2 == 1611220017 ) && field.equals("removeContainerListener") )) || ( (( ( __temp_hash2 == 576751796 ) && field.equals("getContainerListeners") )) || ( (( ( __temp_hash2 == 1969426795 ) && field.equals("processEvent") )) || ( (( ( __temp_hash2 == 1430084328 ) && field.equals("processContainerEvent") )) || ( (( ( __temp_hash2 == 634939509 ) && field.equals("deliverEvent") )) || ( (( ( __temp_hash2 == -1097461934 ) && field.equals("locate") )) || ( (( ( __temp_hash2 == -1626201894 ) && field.equals("getComponentAt") )) || ( (( ( __temp_hash2 == 438337848 ) && field.equals("getMousePosition") )) || ( (( ( __temp_hash2 == 398126743 ) && field.equals("findComponentAt") )) || ( (( ( __temp_hash2 == -1671141420 ) && field.equals("isAncestorOf") )) || ( (( ( __temp_hash2 == 3322014 ) && field.equals("list") )) || ( (( ( __temp_hash2 == 123688912 ) && field.equals("getFocusTraversalKeys") )) || ( (( ( __temp_hash2 == -355296716 ) && field.equals("areFocusTraversalKeysSet") )) || ( (( ( __temp_hash2 == 810219290 ) && field.equals("setFocusTraversalPolicy") )) || ( (( ( __temp_hash2 == -1242052594 ) && field.equals("getFocusTraversalPolicy") )) || ( (( ( __temp_hash2 == 602541344 ) && field.equals("isFocusTraversalPolicySet") )) || ( (( ( __temp_hash2 == -44786190 ) && field.equals("setFocusCycleRoot") )) || ( (( ( __temp_hash2 == -311299910 ) && field.equals("isFocusCycleRoot") )) || ( (( ( __temp_hash2 == 626370347 ) && field.equals("setFocusTraversalPolicyProvider") )) || ( (( ( __temp_hash2 == -1708753933 ) && field.equals("isFocusTraversalPolicyProvider") )) || ( (( ( __temp_hash2 == -606755785 ) && field.equals("transferFocusDownCycle") )) || ( (( ( __temp_hash2 == -679533279 ) && field.equals("applyComponentOrientation") )) || ( (( ( __temp_hash2 == -1117363270 ) && field.equals("addPropertyChangeListener") )) || ( (( ( __temp_hash2 == -1269752847 ) && field.equals("setInheritsPopupMenu") )) || ( (( ( __temp_hash2 == -658829443 ) && field.equals("getInheritsPopupMenu") )) || ( (( ( __temp_hash2 == 1988229040 ) && field.equals("setComponentPopupMenu") )) || ( (( ( __temp_hash2 == -547981916 ) && field.equals("getComponentPopupMenu") )) || ( (( ( __temp_hash2 == 241460722 ) && field.equals("getComponentGraphics") )) || ( (( ( __temp_hash2 == 672648767 ) && field.equals("paintComponent") )) || ( (( ( __temp_hash2 == -490374019 ) && field.equals("paintChildren") )) || ( (( ( __temp_hash2 == -1778836950 ) && field.equals("paintBorder") )) || ( (( ( __temp_hash2 == -838846263 ) && field.equals("update") )) || ( (( ( __temp_hash2 == 106428510 ) && field.equals("paint") )) || ( (( ( __temp_hash2 == -1166363724 ) && field.equals("printAll") )) || ( (( ( __temp_hash2 == 106934957 ) && field.equals("print") )) || ( (( ( __temp_hash2 == -20235056 ) && field.equals("printComponent") )) || ( (( ( __temp_hash2 == 1704032204 ) && field.equals("printChildren") )) || ( (( ( __temp_hash2 == -824599239 ) && field.equals("printBorder") )) || ( (( ( __temp_hash2 == 142938588 ) && field.equals("isPaintingTile") )) || ( (( ( __temp_hash2 == -770686062 ) && field.equals("isPaintingForPrint") )) || ( (( ( __temp_hash2 == 890536972 ) && field.equals("isManagingFocus") )) || ( (( ( __temp_hash2 == 1256979008 ) && field.equals("setNextFocusableComponent") )) || ( (( ( __temp_hash2 == 413687348 ) && field.equals("getNextFocusableComponent") )) || ( (( ( __temp_hash2 == 217231286 ) && field.equals("setRequestFocusEnabled") )) || ( (( ( __temp_hash2 == -375268882 ) && field.equals("isRequestFocusEnabled") )) || ( (( ( __temp_hash2 == 1280029577 ) && field.equals("requestFocus") )) || ( (( ( __temp_hash2 == -132373474 ) && field.equals("requestFocusInWindow") )) || ( (( ( __temp_hash2 == -1605080596 ) && field.equals("grabFocus") )) || ( (( ( __temp_hash2 == -2089656352 ) && field.equals("setVerifyInputWhenFocusTarget") )) || ( (( ( __temp_hash2 == -1816942124 ) && field.equals("getVerifyInputWhenFocusTarget") )) || ( (( ( __temp_hash2 == 2087644222 ) && field.equals("getFontMetrics") )) || ( (( ( __temp_hash2 == 737172192 ) && field.equals("setPreferredSize") )) || ( (( ( __temp_hash2 == -1726352276 ) && field.equals("getPreferredSize") )) || ( (( ( __temp_hash2 == -726354817 ) && field.equals("setMaximumSize") )) || ( (( ( __temp_hash2 == 1045381387 ) && field.equals("getMaximumSize") )) || ( (( ( __temp_hash2 == -1403787411 ) && field.equals("setMinimumSize") )) || ( (( ( __temp_hash2 == 367948793 ) && field.equals("getMinimumSize") )) || ( (( ( __temp_hash2 == -567445985 ) && field.equals("contains") )) || ( (( ( __temp_hash2 == 98093870 ) && field.equals("setBorder") )) || ( (( ( __temp_hash2 == 312710946 ) && field.equals("getBorder") )) || ( (( ( __temp_hash2 == 512222700 ) && field.equals("getInsets") )) || ( (( ( __temp_hash2 == -1328196916 ) && field.equals("getAlignmentY") )) || ( (( ( __temp_hash2 == -554065704 ) && field.equals("setAlignmentY") )) || ( (( ( __temp_hash2 == -1328196917 ) && field.equals("getAlignmentX") )) || ( (( ( __temp_hash2 == -554065705 ) && field.equals("setAlignmentX") )) || ( (( ( __temp_hash2 == -136014978 ) && field.equals("setInputVerifier") )) || ( (( ( __temp_hash2 == 1695427850 ) && field.equals("getInputVerifier") )) || ( (( ( __temp_hash2 == -2116360191 ) && field.equals("getGraphics") )) || ( (( ( __temp_hash2 == -1390686654 ) && field.equals("setDebugGraphicsOptions") )) || ( (( ( __temp_hash2 == 852008758 ) && field.equals("getDebugGraphicsOptions") )) || ( (( ( __temp_hash2 == -1402521984 ) && field.equals("registerKeyboardAction") )) || ( (( ( __temp_hash2 == -1167238055 ) && field.equals("unregisterKeyboardAction") )) || ( (( ( __temp_hash2 == -760205708 ) && field.equals("getRegisteredKeyStrokes") )) || ( (( ( __temp_hash2 == -2016664141 ) && field.equals("getConditionForKeyStroke") )) || ( (( ( __temp_hash2 == -1337788934 ) && field.equals("getActionForKeyStroke") )) || ( (( ( __temp_hash2 == -1777533497 ) && field.equals("resetKeyboardActions") )) || ( (( ( __temp_hash2 == -1834948684 ) && field.equals("setInputMap") )) || ( (( ( __temp_hash2 == -1746368856 ) && field.equals("getInputMap") )) || ( (( ( __temp_hash2 == 1737665796 ) && field.equals("setActionMap") )) || ( (( ( __temp_hash2 == 188673168 ) && field.equals("getActionMap") )) || ( (( ( __temp_hash2 == 357114811 ) && field.equals("getBaseline") )) || ( (( ( __temp_hash2 == -2053764159 ) && field.equals("getBaselineResizeBehavior") )) || ( (( ( __temp_hash2 == -1253361850 ) && field.equals("requestDefaultFocus") )) || ( (( ( __temp_hash2 == -854558288 ) && field.equals("setVisible") )) || ( (( ( __temp_hash2 == 1364071551 ) && field.equals("setEnabled") )) || ( (( ( __temp_hash2 == -1834127547 ) && field.equals("setForeground") )) || ( (( ( __temp_hash2 == -855811280 ) && field.equals("setBackground") )) || ( (( ( __temp_hash2 == 1984576465 ) && field.equals("setFont") )) || ( (( ( __temp_hash2 == 1312303337 ) && field.equals("processComponentKeyEvent") )) || ( (( ( __temp_hash2 == 2139532042 ) && field.equals("processKeyEvent") )) || ( (( ( __temp_hash2 == 69241589 ) && field.equals("processKeyBinding") )) || ( (( ( __temp_hash2 == 90841582 ) && field.equals("setToolTipText") )) || ( (( ( __temp_hash2 == 1862577786 ) && field.equals("getToolTipText") )) || ( (( ( __temp_hash2 == -1795253630 ) && field.equals("getToolTipLocation") )) || ( (( ( __temp_hash2 == -1988967221 ) && field.equals("getPopupLocation") )) || ( (( ( __temp_hash2 == 1106410311 ) && field.equals("createToolTip") )) || ( (( ( __temp_hash2 == 954363430 ) && field.equals("scrollRectToVisible") )) || ( (( ( __temp_hash2 == 753917173 ) && field.equals("setAutoscrolls") )) || ( (( ( __temp_hash2 == -1769313919 ) && field.equals("getAutoscrolls") )) || ( (( ( __temp_hash2 == -1691618275 ) && field.equals("setTransferHandler") )) || ( (( ( __temp_hash2 == 1683315369 ) && field.equals("getTransferHandler") )) || ( (( ( __temp_hash2 == 786391236 ) && field.equals("processMouseEvent") )) || ( (( ( __temp_hash2 == 2065058606 ) && field.equals("processMouseMotionEvent") )) || ( (( ( __temp_hash2 == -1298848381 ) && field.equals("enable") )) || ( (( ( __temp_hash2 == 1671308008 ) && field.equals("disable") )) || ( (( ( __temp_hash2 == -1141635146 ) && field.equals("getClientProperty") )) || ( (( ( __temp_hash2 == -1425362001 ) && field.equals("putClientProperty") )) || ( (( ( __temp_hash2 == -1635067428 ) && field.equals("setFocusTraversalKeys") )) || ( (( ( __temp_hash2 == 1097148750 ) && field.equals("reshape") )) || ( (( ( __temp_hash2 == 312809899 ) && field.equals("getBounds") )) || ( (( ( __temp_hash2 == -75151241 ) && field.equals("getSize") )) || ( (( ( __temp_hash2 == -316023509 ) && field.equals("getLocation") )) || ( (( ( __temp_hash2 == 3169218 ) && field.equals("getX") )) || ( (( ( __temp_hash2 == 3169219 ) && field.equals("getY") )) || ( (( ( __temp_hash2 == 1968952336 ) && field.equals("getWidth") )) || ( (( ( __temp_hash2 == 474985501 ) && field.equals("getHeight") )) || ( (( ( __temp_hash2 == -336661013 ) && field.equals("isOpaque") )) || ( (( ( __temp_hash2 == 470702883 ) && field.equals("setOpaque") )) || ( (( ( __temp_hash2 == 456055999 ) && field.equals("computeVisibleRect") )) || ( (( ( __temp_hash2 == -509772736 ) && field.equals("getVisibleRect") )) || ( (( ( __temp_hash2 == -2036853317 ) && field.equals("firePropertyChange") )) || ( (( ( __temp_hash2 == -800831894 ) && field.equals("fireVetoableChange") )) || ( (( ( __temp_hash2 == -894798487 ) && field.equals("addVetoableChangeListener") )) || ( (( ( __temp_hash2 == -1422550772 ) && field.equals("removeVetoableChangeListener") )) || ( (( ( __temp_hash2 == -637180459 ) && field.equals("getVetoableChangeListeners") )) || ( (( ( __temp_hash2 == -701878888 ) && field.equals("getTopLevelAncestor") )) || ( (( ( __temp_hash2 == -1065055640 ) && field.equals("addAncestorListener") )) || ( (( ( __temp_hash2 == -1567628213 ) && field.equals("removeAncestorListener") )) || ( (( ( __temp_hash2 == -727692042 ) && field.equals("getAncestorListeners") )) || ( (( ( __temp_hash2 == -1228323959 ) && field.equals("getListeners") )) || ( (( ( __temp_hash2 == -146849974 ) && field.equals("addNotify") )) || ( (( ( __temp_hash2 == -1001125651 ) && field.equals("removeNotify") )) || ( (( ( __temp_hash2 == 1094177291 ) && field.equals("repaint") )) || ( (( ( __temp_hash2 == -218282935 ) && field.equals("revalidate") )) || ( (( ( __temp_hash2 == 319849826 ) && field.equals("isValidateRoot") )) || ( (( ( __temp_hash2 == -1444703808 ) && field.equals("isOptimizedDrawingEnabled") )) || ( (( ( __temp_hash2 == -209888556 ) && field.equals("isPaintingOrigin") )) || ( (( ( __temp_hash2 == 1356268992 ) && field.equals("paintImmediately") )) || ( (( ( __temp_hash2 == 383468754 ) && field.equals("setDoubleBuffered") )) || ( (( ( __temp_hash2 == 116955034 ) && field.equals("isDoubleBuffered") )) || ( (( ( __temp_hash2 == 1910920416 ) && field.equals("getRootPane") )) || ( (( ( __temp_hash2 == 1322595613 ) && field.equals("updateUI") )) || ( (( ( __temp_hash2 == 98245738 ) && field.equals("getUI") )) || ( (( ( __temp_hash2 == 109327990 ) && field.equals("setUI") )) || ( (( ( __temp_hash2 == -133970743 ) && field.equals("getUIClassID") )) || ( (( ( __temp_hash2 == 820971262 ) && field.equals("paramString") )) || field.equals("getAccessibleContext") ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("initialize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.initialize(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(1)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case -827125928:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("drawLine")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.drawLine(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(1)) ), dynargs.__get(2), dynargs.__get(3), dynargs.__get(4));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 94746189:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("clear")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.clear();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 128650256:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("drawLabel")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.drawLabel(haxe.lang.Runtime.toString(dynargs.__get(0)), ((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(1)) ), dynargs.__get(2), dynargs.__get(3));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
				case 1264405643:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					if (field.equals("drawRectangle")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
						this.drawRectangle(((haxe.at.dotpoint.math.geom.IRectangle) (dynargs.__get(0)) ), dynargs.__get(1), dynargs.__get(2), dynargs.__get(3));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
					break;
				}
				
				
			}
			
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
				return ((haxe.lang.Function) (this.__hx_getField(field, true, false, false)) ).__hx_invokeDynamic(dynargs);
			}
			
		}
		
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		return null;
	}
	
	
	public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		baseArr.push("accessibleContext");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		baseArr.push("listenerList");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		baseArr.push("ui");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		baseArr.push("scaleFactor");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		baseArr.push("canvas");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\DebugCanvas.hx"
		baseArr.push("layer");
	}
	
	
}


