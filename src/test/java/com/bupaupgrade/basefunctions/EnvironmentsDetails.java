package com.bupaupgrade.basefunctions;

import com.bupaupgrade.helpers.FileReaderManager;

public class EnvironmentsDetails {
	public static String GetEnvironment(String environment) throws Exception
    {
        String _environment = null;
        switch (environment.toUpperCase())
        {
//            case "SMOKE1":
//                _environment = ConfigurationManager.AppSettings["SMOKE1"];
//                break;
//            case "SMOKE2":
//                _environment = ConfigurationManager.AppSettings["SMOKE2"];
//                break;
//            case "UAT1":
//                _environment = ConfigurationManager.AppSettings["UAT1"];
//                break;
//            case "UAT2":
//                _environment = ConfigurationManager.AppSettings["UAT2"];
//                break;
//            case "REGRESSION2":
//                _environment = ConfigurationManager.AppSettings["REGRESSION2"];
//                break;
            case "REGRESSIONUI":
                _environment = FileReaderManager.getInstance().getConfigReader().getBaseUrl("RegressionUI");
                break;
            default:
                _environment = FileReaderManager.getInstance().getConfigReader().getBaseUrl("RegressionUI");;
                break;
        }
        return _environment;
    }
}
