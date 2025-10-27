	import java.awt.Color;
	import java.awt.Font;
	import java.awt.Graphics;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Locale;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import java.util.Calendar;
	import java.util.GregorianCalendar;


	public class Clock extends JPanel implements Runnable{
		Thread thread;
		int i, j, k, p =0,q=0;
		String year,month,day,second,minute,hour;
		SimpleDateFormat sdf = new SimpleDateFormat("s", Locale.getDefault());
		Date cd;
		int xOrigin = 375, yOrigin = 375, xsec, ysec,xmin, ymin,xhr,yhr;
		private void clockLayout(Graphics g){
			//layout of calender
			Calendar calender = new GregorianCalendar();
			year = String.valueOf(calender.get(Calendar.YEAR));
			month =String.valueOf(calender.get(Calendar.MONTH)+1);
			day =String.valueOf(calender.get(Calendar.DATE));
			second =String.valueOf(calender.get(Calendar.SECOND));
			hour =String.valueOf(calender.get(Calendar.HOUR));
			minute=String.valueOf(calender.get(Calendar.MINUTE));
			
			g.setColor(Color.black);
			g.fillRoundRect(590,200,340,370,50,50);
			g.setColor(Color.pink);
			g.fillRoundRect(600,210,320,350,50,50);
			g.setColor(Color.black);
			g.setColor(Color.black);
			g.fillRect(620,280,80,50);
			g.fillRect(710,280,80,50);
			g.fillRect (800,280,100,50);
			g.fillRect(620,350,80,50);
			g.fillRect(710,350,80,50);
			g.fillRect (800,350,100,50);
			g.fillRect(630,470,80,50);
			g.fillRect(720,470,80,50);
			g.fillRect (810,470,80,50);
			g.setColor(Color.black);
			g.setColor(Color.green);
			g.fillRoundRect(610,220,300,50,30,30);
			g.setColor(Color.black);
			g.setFont(new Font("TimesRoman", Font.BOLD, 30));
			g.drawString("CALENDER", 675,255);
			g.setColor(Color.green);
			g.fillRoundRect(610,415,300,50,30,30);
			g.setColor(Color.black);
			g.drawString("Digital Clock", 630,450);
			g.setColor(Color.white);
			g.setFont(new Font("TimesRoman", Font.BOLD, 30));
			g.drawString(" DD ", 630,310);
			g.drawString(" MM ", 715,310);
			g.drawString(" YYYY ", 810,310);
			g.drawString(day,650, 385);
			g.drawString(month,740, 385);
			g.drawString(year,820, 385);
			g.drawString(hour+" H",645,505);
			g.drawString(minute+" M",725,505);
			g.drawString(second+" S",825,505);
				//hanger layout
				
			g.setColor(Color.black);
			g.fillOval(749,154,10,10);
			g.fillOval(698, 213,10,10);
			g.fillOval(808,213,10,10);
			g.drawLine(753,160,700,220);
			g.drawLine(754,161,701,221);
			g.drawLine(753,160,815,220);
			g.drawLine(752,159,814,219);
			//clock circles
			
			g.setColor(Color.blue);
			g.fillOval(xOrigin - 160, yOrigin -160, 320,320);
			g.setFont(new Font("TimesRoman", Font.BOLD, 25));
			g.setColor(Color.black);
			g.fillOval(xOrigin-150,yOrigin-150, 300,300);
			//clock midpoint
			g.setColor(Color.green);
			g.fillOval(xOrigin-5,yOrigin-5, 10,10);
			//Analog text format
			g.fillRoundRect(225,540,300,50, 30,30);
			g.setColor(Color.black);
			g.setFont(new Font("TimesRoman", Font.BOLD, 30));
			g.drawString("ANALOG CLOCK ",245,575);
			//String written text
			g.setColor(Color.blue);
			g.drawString("Clock design by Lavish Todiwal", 300,100);
			g.drawString("under the guidence of ", 180,150);
			g.setColor(Color.black);
			g.setFont(new Font("TimesRoman", Font.BOLD, 35));
			g.drawString("Mr. Manish Bhatia Sir", 5000,150);
			//clock lable
			g.setColor(Color.red);
			g.setFont(new Font("TimesRoman", Font.BOLD, 20));
			g.drawString("12",xOrigin-10,yOrigin-130);
			g.drawString("1",xOrigin+70,yOrigin-115);
			g.drawString("2",xOrigin+119,yOrigin-64);
			g.drawString("3",xOrigin+135,yOrigin+5);
			g.drawString("4",xOrigin+120,yOrigin+74);
			g.drawString("5",xOrigin+65,yOrigin+125);
			g.drawString("6",xOrigin-5,yOrigin+145);
			g.drawString("7",xOrigin-70,yOrigin+125);
			g.drawString("8",xOrigin-125,yOrigin+80);
			g.drawString("9",xOrigin-145,yOrigin-0);
			g.drawString("10",xOrigin-125,yOrigin-65);
			g.drawString("11",xOrigin-80,yOrigin-110);
		}
		public void paint(Graphics g){
			clockLayout(g);
			cd = new Date();
			sdf.applyPattern("s");
			i = Integer.parseInt(sdf.format(cd));
			sdf.applyPattern("m");
			j = Integer.parseInt(sdf.format(cd));
			sdf.applyPattern("h");
			k = Integer.parseInt(sdf.format(cd));
			//values for coordinates and vector forms
			
			int str[] = {0,12,24,37,48,60,70,80,89,97,103,109,114,117,119,119};
			int str1[] = {0,10,20,30,40,50,58,66,74,80,86,91,95,97,99,100};
			int str2[] = {0,40,69,80};
			int str3[] = {9,48,73,79,63,31};
			int str4[] = {20,56,77};
			int str5[]= {29,63,79,74,49,11};
			int m = str.length;
			int n= str1.length;
			//code for second hand
			if(i<16){
				xsec = (int)(str[i] +xOrigin);
				ysec = (int)(-str[n-1-i] +yOrigin);
			}
			else if(i<=30){
				xsec = (int)(str[m-1-i+15] +xOrigin);
				ysec = (int)(str[i-15] +yOrigin);			
			}
			else if(i<=45){
				xsec = (int)(-str[i-30] +xOrigin);
				ysec = (int)(str[m-1-i+30] +yOrigin);			
			}
			else if(i<=60){
				//xsec = (int)(-str[m-1-i+15] +xOrigin);
				xsec = (int)(-str[60 - i] + xOrigin);
				ysec = (int)(-str[i-45] +yOrigin);
				if(i==59){
					i=i-60;
					j++;
				}
			}
			i++;
			//Draw Second Hand line
			g.setColor(Color.cyan);
			g.drawLine(xOrigin,yOrigin,xsec,ysec);
			//code for minute hand
			if(j<16){
				xmin = (int)(str1[j] +xOrigin);
				ymin = (int)(-str[n-1-j] +yOrigin);
			}
			else if(j<=30){
				xmin = (int)(str[n-1-j+15] +xOrigin);
				ymin = (int)(-str[j-15] +yOrigin);			
			}
			else if(j<=45){
				xmin = (int)(-str[j-30] +xOrigin);
				ymin = (int)(str[n-1-j+30] +yOrigin);			
			}
			else if(j<=60){
				xmin = (int)(-str[n-1-j+15] +xOrigin);
				ymin = (int)(-str[j-45] +yOrigin);
				if(j==59){
					j=j-60;
					k++;
				}
			}
			
			//coding for  hour hand
			if(k==1){
				if(j<=15)
				{p = str2[1];q= str2[2];}
				else if(j<=30){
					p= str3[1];
					q=str3[4];
				}
				else if(j<=45){
					p=str4[1];
					q= str4[1];
				}
				else if(j<60){
					p=str5[1];
					q= str5[4];
				}
				xhr = (int)(p+xOrigin);
				yhr = (int)(-q+yOrigin);
			}
			else if(k==2){
				if(j<=15){
					p = str2[2];
					q= str2[1];
				}
				else if(j<=30){
					p= str3[2];
					q=str3[5];
				}
				else if(j<=45){
					p=str4[2];
					q= str4[0];
				}
				else if(j<60){
					p=str5[2];
					q= str5[5];
				}
				xhr = (int)(p+xOrigin);
				yhr = (int)(-q+yOrigin);
			}
			else if(k==3){
				if(j<=15){
					p = str2[3];
					q= str2[0];
				}
				else if(j<=30){
					p= str3[3];
					q=str3[0];
				}
				else if(j<=45){
					p=str4[2];
					q= str4[0];
				}
				else if(j<60){
					p=str5[3];
					q= str5[0];
				}
				xhr = (int)(p+xOrigin);
				yhr = (int)(q+yOrigin);
			}
			else if(k==4){
				if(j<=15){
					p = str2[2];
					q= str2[1];
				}
				else if(j<=30){
					p= str3[2];
					q=str3[1];
				}
				else if(j<=45){
					p=str4[1];
					q= str4[1];
				}
				else if(j<60){
					p=str5[4];
					q= str5[1];
				}
				xhr = (int)(p+xOrigin);
				yhr = (int)(q+yOrigin);
			}
			else if(k==5){
				if(j<=15){
					p = str2[1];
					q= str2[2];
				}
				else if(j<=30){
					p= str3[5];
					q=str3[2];
				}
				else if(j<=45){
					p=str4[0];
					q= str4[2];
				}
				else if(j<60){
					p=str5[5];
					q= str5[2];
				}
				xhr = (int)(p+xOrigin);
				yhr = (int)(q+yOrigin);
			}
			else if(k==6){
				if(j<=15){
					p = str2[0];
					q= str2[3];
				}
				else if(j<=30){
					p= str3[0];
					q=str3[3];
				}
				else if(j<=45){
					p=str4[0];
					q= str4[2];
				}
				else if(j<60){
					p=str5[0];
					q= str5[3];
				}
				xhr = (int)(-p+xOrigin);
				yhr = (int)(q+yOrigin);
			}
			else if(k==7){
				if(j<=15){
					p = str2[1];
					q= str2[2];
				}
				else if(j<=30){
					p= str3[1];
					q=str3[4];
				}
				else if(j<=45){
					p=str4[1];
					q= str4[1];
				}
				else if(j<60){
					p=str5[1];
					q= str5[4];
				}
				xhr = (int)(-p+xOrigin);
				yhr = (int)(q+yOrigin);
			}
			else if(k==8){
				if(j<=15){
					p = str2[2];
					q= str2[1];
				}
				else if(j<=30){
					p= str3[2];
					q=str3[5];
				}
				else if(j<=45){
					p=str4[2];
					q= str4[0];
				}
				else if(j<60){
					p=str5[2];
					q= str5[5];
				}
				xhr = (int)(-p+xOrigin);
				yhr = (int)(q+yOrigin);
			}
			else if(k==9){
				if(j<=15){
					p = str2[3];
					q= str2[0];
				}
				else if(j<=30){
					p= str3[3];
					q=str3[0];
				}
				else if(j<=45){
					p=str4[2];
					q= str4[0];
				}
				else if(j<60){
					p=str5[3];
					q= str5[0];
				}
				xhr = (int)(-p+xOrigin);
				yhr = (int)(-q+yOrigin);
			}
			else if(k==10){
				if(j<=15){
					p = str2[2];
					q= str2[1];
				}
				else if(j<=30){
					p= str3[4];
					q=str3[1];
				}
				else if(j<=45){
					p=str4[1];
					q= str4[1];
				}
				else if(j<60){
					p=str5[4];
					q= str5[1];
				}
				xhr = (int)(-p+xOrigin);
				yhr = (int)(-q+yOrigin);
			}
			else if(k==11){
				if(j<=15){
					p = str2[1];
					q= str2[2];
				}
				else if(j<=30){
					p= str3[5];
					q=str3[2];
				}
				else if(j<=45){
					p=str4[0];
					q= str4[2];
				}
				else if(j<60){
					p=str5[5];
					q= str5[2];
				}
				xhr = (int)(-p+xOrigin);
				yhr = (int)(q+yOrigin);
			}
			else if(k==12){
				if(j<=15){
					p = str2[0];
					q= str2[3];
				}
				else if(j<=30){
					p= str3[0];
					q=str3[3];
				}
				else if(j<=45){
					p=str4[0];
					q= str4[2];
				}
				else if(j<60){
					p=str5[0];
					q= str5[3];
				}
				xhr = (int)(p+xOrigin);
				yhr = (int)(-q+yOrigin);
			}

			// if((j==59) && (i==59)){
				// k=0;
			// }
			
			//draw minute hand
			g.setColor(Color.white);
			g.drawLine(xOrigin,yOrigin,xmin,ymin);
			//draw hour hand
			g.setColor(Color.magenta);
			g.drawLine(xOrigin,yOrigin,xhr,yhr);
			g.setColor(Color.black);
		}
		public void startclock(){
			thread = new Thread(this);
			thread.start();
		}
		public void run(){
			while(thread != null){
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					System.out.println(e);
				}
				repaint();
			}
			thread = null;
		}
		public static void main(String... s){
			JFrame jf  = new JFrame();
			Color c = new Color(190,190,190);
			jf.setBackground(c);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//jf.setBounds(0,0,200,200);
			
			jf.setSize(1000, 800);
			jf.setLocationRelativeTo(null); // This centers the window on the screen

			Clock ps = new Clock();
			jf.getContentPane().add(ps);
			jf.setVisible(true);
			ps.startclock();
		}
	}