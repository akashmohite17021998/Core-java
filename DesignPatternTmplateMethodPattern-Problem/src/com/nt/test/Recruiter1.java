package com.nt.test;

import com.nt.recruitment.HireJavaFresher;

public class Recruiter1 {

	public static void main(String[] args) {
		boolean flag = true;
		
		HireJavaFresher javaFresher = new HireJavaFresher();
		
		if(!javaFresher.conductAptitudeTest())
			flag = false;
			if(!javaFresher.conductGDTest())
				flag = false;
				if(!javaFresher.conductJavaWrittenTest())
					flag = false;
					if(!javaFresher.conductJavaTechnicalTest())
						flag = false;
						if(!javaFresher.conductHRTest())
							flag = false;
						if(flag)
							System.out.println("Java fresher recruited.");
						else
							System.out.println("Java fresher not recruited");
	}
}
