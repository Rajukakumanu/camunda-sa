camunda-osa-test
=================

Need Bit bucket access and please use the Clone request to download  the code to ur local :
"https://kakur@stash.dts.fm.rbsgrp.net/scm/ebpm/camunda-osa-test.git"

Please navigate to the path "\camunda-osa-test\src\test\resources\TestData\TestData.properties" and change the URl and Login details necessary

Password Encryption:

Navigate to src/test/java/utilities/UserActions file and pick the Method

public void password(String[] intText) {
		String strToEncode = "enter your password here";
		String key = "demo";
		String strEncryptedString = encryptXOR(strToEncode, key);
		System.out.println("Encrypted string: " + strEncryptedString);
		String decodedPwd = decryptXOR(strEncryptedString, key);
		System.out.println("Decrypted string: " + decodedPwd);
	}

	Once the above method is run a encryped string is generated. Please copy the string and place in password variables of Testdata.properties file


This is to create chrome profile in ur local to run the download attachment


1. Create a chrome.exe shorcut in ur desktop
2. Right click on chrome and go to properties
3. Add this "--user-data-dir=C:\chrome-dev-profile" command end of Target and save
4.Create a folder under C:\PDF_files
5.Open chrome/settings/advanced and select download path to above








