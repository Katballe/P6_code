package dk.aau.model.person;

import java.util.List;

import dk.aau.App;
import dk.aau.model.SafetyCriteriaModel;

public class HealthcarePersonelModel {

    public static boolean exit = false; // Ikke MVC, men til fuldt stop
    /*
     * 
     * boolean fullstop = false;
     * 
     * // skal gentages else if(inputString.equals("FullStop")) { fullstop = true; }
     * 
     * if(fullstop) break;
     */

    // Metoder
    public void tickQualitativeSCResults() {

        for (SafetyCriteriaModel SC : SafetyCriteriaModel.getSC()) {
            // her
            if (exit == true) {
                break;
            }
            // til her
            System.out.print("Insert the value of ");
            boolean savedValue;
            switch (SC.getName()) {

                // case name
                case "Laktat":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "FiO2":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }

                    break;

                case "PEEP":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "RASS":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Respiratory rate":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "SaO2":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Ventricular rate":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                        savedValue = false;
                        while (!savedValue) {
                            System.out.println("Any stable tachyarrhythmia? [Insert: Yes/No]:");
                            String input = App.input.nextLine();
                            try {
                                if (input.equals("Yes") || input.equals("yes")) {
                                    SC.setStableTachy(true);
                                    savedValue = true;
                                } else if (input.equals("No") || input.equals("no")) {
                                    SC.setStableTachy(false);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Endotracheal Tube":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Tracheostomy Tube":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Mode HFOV":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Ventilator Dysynchrony":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Nitric Oxide":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Prostacyclin":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Prone Positioning":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Intravenous antihypotensive therapy for hypotensive emergency":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Known or suspected severepulmonary hypertension":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Requiring pharmacological treatment (e.g. isoprenaline) or awaiting emergency pacemaker insertion":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Not requiring pharmacological treatment and not awaiting emergency pacemaker insertion":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Dependent Rhythm":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Stable Underlying Rhythm":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Femoral IABP":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Femoral or subclavian (not single bicaval dual lumen cannulae)":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Single bicaval dual lumen cannulae insertedinto a central vein":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Ventricular Assist Device":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Pulmonary Artery Catheter or other continuous cardiac output monitoring device":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Known or suspected acute DVT/PE":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Known or suspected severe aortic stenosis":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Cardiac ischemia (defined as ongoing chest pain and/or dynamic EKG changes)":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Delirum tool -ve":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Delirium tool +ve and able to follow simple commmands":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Delirium tool +ve and not able to follow simple commmands":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Active management of intracranial hypertension, with ICP not in desired range":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Intracranial pressure monitoring without activemanagement of intracranial hypertension":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Craniectomy":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Open lumbar drain (not clamped)":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Subgaleal drain":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Spinal precautions (pre-clearence or fixation)":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Acute spinal cord injury":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Subarachnoid haemorrhage with unclipped aneurysm":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Vasospasm post-aneurysmal clipping":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Uncontrolled seizures":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "ICUAW":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Renal Replacement Therapy":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Venous and arterial femoral catheters":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Femoral Sheats":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Other drains and attachements":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Known uncontrolled active bleedeing":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Suspicion of active bleeding or increasedbleeding risk":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Patient is febrile with a temperature exceedingacceptable maximum despite active physicalor pharmacological cooling mangagement":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Active hypothermia management":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Unstable/unstabilized major fracture (Pelvic, spinal, lower limp long bone)":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "Large open wound (Chest/Sternum, abdomen)":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("Exit") || inputString.equals("exit")) {
                                    exit = true;
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                    exit = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    break;

                case "MAP":
                    System.out.print(SC.getName());
                    savedValue = false;
                    while (savedValue == false) {
                        if (SC.getTakesNumber()) {
                            System.out.println(" [insert number]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                } else {
                                    SC.setQuantitativeSCValue(Double.parseDouble(inputString));
                                    savedValue = true;
                                    SC.setRecievedValue(true);
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        } else {
                            System.out.println(" [insert yes/no]: ");
                            String inputString = App.input.nextLine();
                            try {
                                if (inputString.equals("exit") || inputString.equals("Exit")) {
                                    savedValue = true;
                                } else if (inputString.equals("yes") || inputString.equals("Yes")) {
                                    SC.setQualitativeSCValueBool(true);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                } else if (inputString.equals("no") || inputString.equals("No")) {
                                    SC.setQualitativeSCValueBool(false);
                                    SC.setRecievedValue(true);
                                    savedValue = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input");
                                savedValue = false;
                            }
                        }
                    }
                    savedValue = false;
                    while (!savedValue) {
                        System.out.println("Is MAP causing symptoms [Yes/No]:");
                        String input = App.input.nextLine();
                        try {
                            if (input.equals("Yes") || input.equals("yes")) {
                                SC.setMAPCausingSymptoms(true);
                                savedValue = true;
                            } else if (input.equals("No") || input.equals("no")) {
                                SC.setMAPCausingSymptoms(false);
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                    savedValue = false;
                    while (!savedValue) {
                        System.out.println("Insert level of MAP support [None, Low, Moderate or High]");
                        String input = App.input.nextLine();
                        try {
                            if (input.equals("None") || input.equals("none")) {
                                SC.setLevelOfMAPSupport("None");
                                savedValue = true;
                            } else if (input.equals("Low") || input.equals("low")) {
                                SC.setLevelOfMAPSupport("Low");
                                savedValue = true;
                            } else if (input.equals("Moderate") || input.equals("moderate")) {
                                SC.setLevelOfMAPSupport("Moderate");
                                savedValue = true;
                            } else if (input.equals("High") || input.equals("high")) {
                                SC.setLevelOfMAPSupport("High");
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }

                    break;

                default:
                    System.out.println("Vi burde ikke have været her. Et navn er skrevet forkert");
                    break;
            }
        }
    }

    // private void requestQuantitativeSCfromEPJ() {} // not this time

    // X
    public void tickQualitativeSCresultsIfMissing(List<SafetyCriteriaModel> list) {
        if (exit == false) {
            for (SafetyCriteriaModel s : list) {
                if (exit == true) {
                    break;
                }
                System.out.println("tickQuantitative: " + s.getName()); // en ny tekst
                boolean savedValue = false;
                while (!savedValue) {
                    System.out.println("[Insert yes/no]: ");
                    String input = App.input.nextLine();
                    try {
                        if (input.equals("Yes") || input.equals("yes")) {
                            s.setQualitativeSCValueBool(true);
                            s.setRecievedValue(true);
                            savedValue = true;
                        } else if (input.equals("No") || input.equals("no")) {
                            s.setQualitativeSCValueBool(false);
                            s.setRecievedValue(true);
                            savedValue = true;
                        } else if (input.equals("exit") || input.equals("Exit")) {
                            savedValue = true;
                            exit = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                }
            }
        }
    }

    // X
    public void enterResultsForSCIfMissing(List<SafetyCriteriaModel> list) {

        if (exit == false) {
            for (SafetyCriteriaModel s : list) {
                if (exit == true) {
                    break;
                }
                System.out.println("Enter results for: " + s.getName()); // en ny tekst
                boolean savedValue = false;
                while (!savedValue) {
                    System.out.println("[Insert a number]: ");
                    String input = App.input.nextLine();
                    try {
                        if (input.equals("exit") || input.equals("Exit")) {
                            savedValue = true;
                            exit = true;
                        } else {
                            s.setQuantitativeSCValue(Double.parseDouble(input));
                            s.setRecievedValue(true);
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                }
            }
        }
    }

    //
    public void enterMAPIfMissing() {

        if (exit == false) {
            for (SafetyCriteriaModel s : SafetyCriteriaModel.getSC()) {

                if (exit == true) {
                    break;
                }
                if (s.getName().equals("MAP")) {
                    System.out.println("Enter result for: " + s.getName()); // en ny tekst
                    boolean savedValue = false;
                    while (!savedValue) {
                        System.out.println("[Insert a number]: ");
                        String input = App.input.nextLine();
                        try {
                            if (input.equals("exit") || input.equals("Exit")) {
                                exit = true;
                                savedValue = true;
                            } else {
                                s.setQuantitativeSCValue(Double.parseDouble(input));
                                s.setRecievedValue(true);
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }

            }
        }
    }

    //
    public void enterMAPIfUnrealistic() {

        if (exit == false) {
            for (SafetyCriteriaModel s : SafetyCriteriaModel.getSC()) {
                if (exit == true) {
                    break;
                }
                if (s.getName().equals("MAP")) {
                    System.out.println("Enter result for: " + s.getName()); // en ny tekst
                    boolean savedValue = false;
                    while (!savedValue) {
                        System.out.println("[Insert a number]: ");
                        String input = App.input.nextLine();
                        try {
                            if (input.equals("exit") || input.equals("Exit")) {
                                savedValue = true;
                                exit = true;
                            } else {
                                s.setQuantitativeSCValue(Double.parseDouble(input));
                                s.setRecievedValue(true);
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
        }
    }

    //
    public void enterResultsForSCIfUnrealistic(List<SafetyCriteriaModel> list) {

        if (exit == false) {
            for (SafetyCriteriaModel s : list) {
                if (exit == true) {
                    break;
                }
                System.out.println("Enter results for: " + s.getName()); // en ny tekst
                boolean savedValue = false;
                while (!savedValue) {
                    System.out.println("[Insert a number]: ");
                    String input = App.input.nextLine();
                    try {
                        if (input.equals("exit") || input.equals("Exit")) {
                            savedValue = true;
                            exit = true;
                        } else {
                            s.setQuantitativeSCValue(Double.parseDouble(input));
                            s.setRecievedValue(true);
                            savedValue = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        savedValue = false;
                    }
                }
            }
        }
    }

    //
    public void enterMAPInterval() {
        boolean savedValue = false;
        boolean isMapMinSet = false;
        if (exit == false) {
            while (savedValue == false) {

                for (SafetyCriteriaModel SC : SafetyCriteriaModel.getSC()) {
                    if (SC.getName().equals("MAP") && SC.getTakesNumber() == true) {
                        System.out.println(" [Insert lower limit of the target range for MAP]: ");
                        String inputValueMin = App.input.nextLine();
                        try {
                            if (inputValueMin.equals("exit") || inputValueMin.equals("Exit")) {
                                isMapMinSet = true;
                                savedValue = true;
                                exit = true;
                            } else {
                                SC.setMAPIntervalMin(Double.parseDouble(inputValueMin));
                                isMapMinSet = true;
                                SC.setRecievedValue(true);

                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                    if (SC.getName().equals("MAP") && SC.getTakesNumber() == true && isMapMinSet == true
                            && exit == false) {
                        System.out.println(" [Insert higher limit of the target range for MAP]: ");
                        String inputValueMax = App.input.nextLine();
                        try {
                            if (inputValueMax.equals("exit") || inputValueMax.equals("Exit")) {
                                savedValue = true;
                            } else {
                                SC.setMAPIntervalMax(Double.parseDouble(inputValueMax));
                                SC.setRecievedValue(true);
                                savedValue = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            savedValue = false;
                        }
                    }
                }
            }
        }
    }
}