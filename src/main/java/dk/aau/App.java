/*
* This Java source file was generated by the Gradle 'init' task.
*/
package dk.aau;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import dk.aau.model.SafetyCriteriaModel;
import dk.aau.model.categorization.ColorCategorizationsModel;
import dk.aau.model.categorization.EMCategoriesModel;
import dk.aau.model.person.HealthcarePersonelModel;
import dk.aau.model.person.PatientModel;
import dk.aau.view.SafetyAssessmentView;


public class App {
    // tidshåndterings variabler 
    public static long days = (long) 7; // antallet af dage der kigged bagud
    public static String currentDate;
    public static String previousDate;
    public static String dateForAge;
    //public static List<SafetyCriteriaModel> allCriteriasList = new ArrayList<SafetyCriteriaModel>();
    
    public static void main(String[] args) {
        // sætter tiden 
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
        DateTimeFormatter formatForAge = DateTimeFormatter.ofPattern("yyMMdd");
        currentDate = myDateObj.format(myFormatObj);
        dateForAge = myDateObj.format(formatForAge);
        LocalDateTime a = myDateObj.minus(days, ChronoUnit.DAYS);
        previousDate = a.format(myFormatObj);
        
        init.InitSafetyCriteria();
        //init.GiveValues();
        
        // ### FOR TESTING ###
        int i = 0;
        for (SafetyCriteriaModel sc : SafetyCriteriaModel.getScEPJ()) {
            sc.setValueNumber(i);
            i++;
            if(i % 2 == 0)
                sc.setValueBool(true);
            else 
                sc.setValueBool(false);
        }

        
    
        ColorCategorizationsModel.performColorCategoIB();
        ColorCategorizationsModel.performColorCategoOB();

        EMCategoriesModel.assignEMCategoIB();
        EMCategoriesModel.assignEMCategoOB();
        
        for (SafetyCriteriaModel sCriteriaModel : SafetyCriteriaModel.getScEPJ()) {
            System.out.println(sCriteriaModel.getName());
            System.out.println(sCriteriaModel.getValueBool());
            System.out.println(sCriteriaModel.getValueNumber());
            System.out.println(sCriteriaModel.getColor());
        }

        System.out.println("EM kategori i sengen: " + SafetyAssessmentView.getEMCategorizationIB());
        System.out.println("EM kategori udenfor sengen: " + SafetyAssessmentView.getEMCategorizationOB());
        
        //Patient instantieres
        PatientModel patientModel = new PatientModel(1234567890);
        
        /*
        HandlerChokLaktatModel laktath = new HandlerChokLaktatModel();
        DatabaseManipulator.executeQueryWithResultSet(laktath);
        HandlerFiO2Model fio2h = new HandlerFiO2Model();
        DatabaseManipulator.executeQueryWithResultSet(fio2h); 
        HandlerPEEPModel peeph = new HandlerPEEPModel();
        DatabaseManipulator.executeQueryWithResultSet(peeph); 
        HandlerRASSModel rassh = new HandlerRASSModel();
        DatabaseManipulator.executeQueryWithResultSet(rassh); 
        HandlerRespRateModel resph = new HandlerRespRateModel();
        DatabaseManipulator.executeQueryWithResultSet(resph); 
        HandlerSaO2Model sao2h = new HandlerSaO2Model();
        DatabaseManipulator.executeQueryWithResultSet(sao2h); 
        HandlerVentriRateModel ventrih = new HandlerVentriRateModel();
        DatabaseManipulator.executeQueryWithResultSet(ventrih);     
        */
        

        
        // Map instantieres
        HealthcarePersonelModel map = new HealthcarePersonelModel("Map", 0);
        HealthcarePersonelModel.AddToListMapInterval(map);
        
        //int i = 0;
        
        /*
        // --- MANGELER ---
        // SafetyCriteria sc sammenlignes med alle instanser af SafetyCriteria i listen scEPJ for manglende resultater
        for (SafetyCriteriaModel sc : SafetyCriteriaModel.getScEPJ()) {
            if (sc.getValueNumber() == 0) {
                WarningsModel.AddToListMissingResultsForSCEPJ(sc);
                // sc.setValueNumber(i);
                // i++;
                System.out.println(sc.getName() + " " + "tilføjet til liste med manglende sikkerhedskriterier");
            }
            else if (sc.getValueNumber() > 0) {
                SafetyCriteriaModel.AddToListQuanti(sc);
                System.out.println(sc.getName() + " " + "tilføjet til liste med godkendte kvantiative sikkerhedskriterier");
            }
        }
        
        // SafetyCriteria sc sammenlignes med alle instanser af SafetyCriteria i listen scEPJ for urealistiske resultater
        for (SafetyCriteriaModel sc : SafetyCriteriaModel.getScEPJ()) {
            if (sc.getValueNumber() <= 0) {
                WarningsModel.AddToListUnrealisticResultsForSCEPJ(sc);
                //sc.setValueNumber(i);
                //i++;
                System.out.println(sc.getName() + " " + "tilføjet til liste med urealistiske sikkerhedskriterier");
            }
            else if (sc.getValueNumber() > 0) {
                SafetyCriteriaModel.AddToListQuanti(sc);
                System.out.println(sc.getName() + " " + "tilføjet til liste med godkendte kvantiative sikkerhedskriterier");
            }
        }
        
        // HealthCarePersonelModel hp sammenlignes med alle instanser af map i listen mapInterval for manglende resultater
        for (HealthcarePersonelModel hp : HealthcarePersonelModel.getMapInterval()) {
            if (hp.getValueNumber() == 0) {
                WarningsModel.AddToListMissingMAP(hp);
                //hp.setValueNumber(i);
                //i++;
                System.out.println(hp.getName() + " " + "tilføjet til liste med manglende MAP interval");
            }
            else if (hp.getValueNumber() > 0) {
                //SafetyCriteria.AddToListQuanti(sc);
                System.out.println(hp.getName() + " " + "tilføjet til liste med godkendte kvantiative sikkerhedskriterier");
            }
        }
        
        // HealthCarePersonelModel hp sammenlignes med alle instanser af map i listen mapInterval for urealistiske resultater
        for (HealthcarePersonelModel hp : HealthcarePersonelModel.getMapInterval()) {
            if (hp.getValueNumber() == 0) {
                WarningsModel.AddToListUnrealisticMAPInterval(hp);
                //hp.setValueNumber(i);
                //i++;
                System.out.println(hp.getName() + " " + "tilføjet til liste med urealistiske MAP interval");
            }
            else if (hp.getValueNumber() > 0) {
                //SafetyCriteria.AddToListQuanti(sc);
                System.out.println(hp.getName() + " " + "tilføjet til liste med godkendte kvantiative sikkerhedskriterier");
            }
            
            
        }
        */
    }
    
}
    