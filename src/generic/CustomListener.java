package generic;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String v = sdf.format(new Date());
				
		try 
		{
			Robot r = new Robot();
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle ScreenRect=new Rectangle(d);
			BufferedImage img = r.createScreenCapture(ScreenRect);
		
			File dst=new File("/home/tyss/Desktop"+v+".png");
			ImageIO.write(img, ".png", dst);
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
		}
		
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		{
				SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
				String v = sdf.format(new Date());
						
				try 
				{
					Robot r = new Robot();
					Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
					Rectangle ScreenRect=new Rectangle(d);
					BufferedImage img = r.createScreenCapture(ScreenRect);
				
					File dst=new File("/home/tyss/Desktop"+v+".png");
					ImageIO.write(img, ".png", dst);
					
				} 
				catch (Exception e)
				{
					// TODO Auto-generated catch block
				}
						
			}


		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
