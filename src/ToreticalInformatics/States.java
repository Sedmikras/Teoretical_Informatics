package ToreticalInformatics;

enum States implements State {
    Init {
    	public String jmeno = "S0";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zluta\n"+
    							"S2 - zluta\n"+
    							"S3 - zluta\n"+
    							"S4 - zluta\n"+
    							"S5 - zluta\n"+
    							"S6 - zluta\n"+
    							"S7 - cervena\n"+
    							"S8 - cervena\n"+
    							"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G1;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Init;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return Init;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return Init;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G1 {
    	public String jmeno = "S1";
    	public String cas = "t1 - 20 sekund";
    	public String sviti = 	"S1 - zelena\n"+
    							"S2 - cervena\n"+
    							"S3 - zelena\n"+
    							"S4 - zelena\n"+
    							"S5 - cervena\n"+
    							"S6 - cervena\n"+
    							"S7 - cervena\n"+
    							"S8 - cervena\n"+
    							"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G12;
                case Utilities.BUTTON_1:
                    return Y1;
                case Utilities.BUTTON_2:
                    return B1;
                case Utilities.BUTTON_3:
                    return R1;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G12 {
    	public String jmeno = "S1-2";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena\n"+
								"S3 - zelena\n"+
								"S4 - zluta\n"+
								"S5 - cervena\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G2;
                case Utilities.BUTTON_1:
                    return Y12;
                case Utilities.BUTTON_2:
                    return B12;
                case Utilities.BUTTON_3:
                    return R12;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G2 {
    	public String jmeno = "S2";
    	public String cas = "t1 - 20 sekund";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena\n"+
								"S3 - zelena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - zelena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G23;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return G2;
                case Utilities.BUTTON_2:
                    return B2;
                case Utilities.BUTTON_3:
                    return R2;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
       	}
    },
    G23 {
    	public String jmeno = "S2-3";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena + zluta\n"+
								"S3 - zluta\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - cervena + zluta\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G3;
                case Utilities.BUTTON_1:
                    return Y23;
                case Utilities.BUTTON_2:
                    return B23;
                case Utilities.BUTTON_3:
                    return R23;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G3 {
    	public String jmeno = "S3";
    	public String cas = "t1 - 20 sekund";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G34;
                case Utilities.BUTTON_1:
                    return Y3;
                case Utilities.BUTTON_2:
                    return B3;
                case Utilities.BUTTON_3:
                    return R3;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G34 {
    	public String jmeno = "S3-4";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zluta\n"+
								"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G4;
                case Utilities.BUTTON_1:
                    return Y34;
                case Utilities.BUTTON_2:
                    return B34;
                case Utilities.BUTTON_3:
                    return R34;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G4 {
    	public String jmeno = "S4";
    	public String cas = "t1 - 20 sekund";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - zelena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G45;
                case Utilities.BUTTON_1:
                    return Y4;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return G4;
                case Utilities.BUTTON_3:
                    return R4;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G45 {
    	public String jmeno = "S4-5";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - zluta\n"+
								"S3 - cervena\n"+
								"S4 - cervena + zluta\n"+
								"S5 - cervena + zluta\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G5;
                case Utilities.BUTTON_1:
                    return Y45;
                case Utilities.BUTTON_2:
                    return B45;
                case Utilities.BUTTON_3:
                    return R45;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G5 {
    	public String jmeno = "S5";
    	public String cas = "t1 - 20 sekund";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G56;
                case Utilities.BUTTON_1:
                    return Y5;
                case Utilities.BUTTON_2:
                    return B5;
                case Utilities.BUTTON_3:
                    return R5;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G56 {
    	public String jmeno = "S5-6";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - zluta\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G6;
                case Utilities.BUTTON_1:
                    return Y56;
                case Utilities.BUTTON_2:
                    return B56;
                case Utilities.BUTTON_3:
                    return R56;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G6 {
    	public String jmeno = "S6";
    	public String cas = "t1 - 20 sekund";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - cervena\n"+
								"S7 - zelena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G61;
                case Utilities.BUTTON_1:
                    return Y6;
                case Utilities.BUTTON_2:
                    return B6;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return G6;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    G61 {
    	public String jmeno = "S6-1";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena + zluta\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zluta\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G1;
                case Utilities.BUTTON_1:
                    return Y61;
                case Utilities.BUTTON_2:
                    return B61;
                case Utilities.BUTTON_3:
                    return R61;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },

    Y1 {
    	public String jmeno = "S1'";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - zelena\n"+
    							"S2 - cervena\n"+
								"S3 - zelena\n"+
								"S4 - zelena\n"+
								"S5 - cervena\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y12;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y1;
                case Utilities.BUTTON_2:
                    return B1;
                case Utilities.BUTTON_3:
                    return R1;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    Y12 {
    	public String jmeno = "S1-2'";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena\n"+
								"S3 - zelena\n"+
								"S4 - zluta\n"+
								"S5 - cervena\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G2;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y12;
                case Utilities.BUTTON_2:
                    return B12;
                case Utilities.BUTTON_3:
                    return R12;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    Y23 {
    	public String jmeno = "S2-3'";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena + zluta\n"+
								"S3 - zluta\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - cervena + zluta\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y3;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y23;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return Y23;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return Y23;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    Y3 {
    	public String jmeno = "S3'";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y34;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y3;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return Y3;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return Y3;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    Y34 {
    	public String jmeno = "S3-4'";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zluta\n"+
								"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y4;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y34;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return Y34;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return Y34;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    Y4 {
    	public String jmeno = "S4'";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - zelena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y45;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y4;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return Y4;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return Y4;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    Y45 {
    	public String jmeno = "S4-5'";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - zluta\n"+
								"S3 - cervena\n"+
								"S4 - cervena + zluta\n"+
								"S5 - cervena + zluta\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y5;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y45;
                case Utilities.BUTTON_2:
                    return B45;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return Y45;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    Y5 {
    	public String jmeno = "S5'";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y56;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y5;         
                case Utilities.BUTTON_2:
                    return B5;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return Y5;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    Y56 {
    	public String jmeno = "S5-6'";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - zluta\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y6;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y56; 
                case Utilities.BUTTON_2:
                    return B56;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return Y56;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    Y6 {
    	public String jmeno = "S6'";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - cervena\n"+
								"S7 - zelena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y61;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y6; 
                case Utilities.BUTTON_2:
                    return B6;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return Y6;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    Y61 {
    	public String jmeno = "S6-1'";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena + zluta\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zluta\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y1;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return Y61; 
                case Utilities.BUTTON_2:
                    return B61;
                case Utilities.BUTTON_3:
                    return R61;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },

    B1 {
    	public String jmeno = "S1''";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena\n"+
								"S3 - zelena\n"+
								"S4 - zelena\n"+
								"S5 - cervena\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B12;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return B1; 
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B1;
                case Utilities.BUTTON_3:
                    return R1;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    B12 {
    	public String jmeno = "S1-2''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zluta\n"+
    							"S2 - zluta\n"+
    							"S3 - zluta\n"+
    							"S4 - zluta\n"+
    							"S5 - zluta\n"+
    							"S6 - zluta\n"+
    							"S7 - cervena\n"+
    							"S8 - cervena\n"+
    							"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B2;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return B12; 
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B12;
                case Utilities.BUTTON_3:
                    return R12;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    B2 {
    	public String jmeno = "S2''";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena\n"+
								"S3 - zelena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - zelena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B23;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return B2; 
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B2;
                case Utilities.BUTTON_3:
                    return R2;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    B23 {
    	public String jmeno = "S2-3''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena + zluta\n"+
								"S3 - zluta\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - cervena + zluta\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B3;
                case Utilities.BUTTON_1:
                    return Y23;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B23;
                case Utilities.BUTTON_3:
                    return R3;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    B3 {
    	public String jmeno = "S3''";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B34;
                case Utilities.BUTTON_1:
                    return Y3;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B3;
                case Utilities.BUTTON_3:
                    return R3;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    B34 {
    	public String jmeno = "S3-4''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zluta\n"+
								"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G4;
                case Utilities.BUTTON_1:
                    return Y34;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B34;
                case Utilities.BUTTON_3:
                    return R34;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    B45 {
    	public String jmeno = "S4-5''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - zluta\n"+
								"S3 - cervena\n"+
								"S4 - cervena + zluta\n"+
								"S5 - cervena + zluta\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B5;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return B45;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B45;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return B45;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    B5 {
    	public String jmeno = "S5''";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B56;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return B5;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B5;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return B5;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
       }
    },
    B56 {
    	public String jmeno = "S5-6''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - zluta\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B6;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return B56;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B56;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return B56;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
       }
    },
    B6 {
    	public String jmeno = "S6''";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - cervena\n"+
								"S7 - zelena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B61;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return B6;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B6;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                    return B6;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    B61 {
    	public String jmeno = "S6-1''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena + zluta\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zluta\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B1;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return B61; 
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                    return B61;
                case Utilities.BUTTON_3:
                    return R61;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },

    R1 {
    	public String jmeno = "S1'''";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena\n"+
								"S3 - zelena\n"+
								"S4 - zelena\n"+
								"S5 - cervena\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R12;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return R1;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                	return R1;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R1;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    R12 {
    	public String jmeno = "S1-2'''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena\n"+
								"S3 - zelena\n"+
								"S4 - zluta\n"+
								"S5 - cervena\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R2;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return R12;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                	return R12;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R12;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    R2 {
    	public String jmeno = "S2'''";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena\n"+
								"S3 - zelena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - zelena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R23;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return R2;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                	return R2;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R2;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    R23 {
    	public String jmeno = "S2-3'''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - cervena + zluta\n"+
								"S3 - zluta\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - cervena + zluta\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R3;
                case Utilities.BUTTON_1:
                    return Y23;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                	return R23;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R23;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    R3 {
    	public String jmeno = "S3'''";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - zelena\n"+
								"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R34;
                case Utilities.BUTTON_1:
                    return Y3;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                	return R3;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R3;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    R34 {
    	public String jmeno = "S3-4'''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zluta\n"+
								"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R4;
                case Utilities.BUTTON_1:
                    return Y34;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                	return R34;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R34;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    R4 {
    	public String jmeno = "S4'''";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - cervena\n"+
    							"S2 - zelena\n"+
								"S3 - cervena\n"+
								"S4 - cervena\n"+
								"S5 - cervena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - zelena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R45;
                case Utilities.BUTTON_1:
                    return Y4;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                	return R4;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R4;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
       }
    },
    R45 {
    	public String jmeno = "S4-5'''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - zluta\n"+
								"S3 - cervena\n"+
								"S4 - cervena + zluta\n"+
								"S5 - cervena + zluta\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R5;
                case Utilities.BUTTON_1:
                    return Y45;
                case Utilities.BUTTON_2:
                    return B45;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R45;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    R5 {
    	public String jmeno = "S5'''";
    	public String cas = "t2 - 15 sekund";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - zelena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y56;
                case Utilities.BUTTON_1:
                    return Y5;
                case Utilities.BUTTON_2:
                    return B5;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R5;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },
    R56 {
    	public String jmeno = "S5-6'''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zelena\n"+
								"S6 - zluta\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G6;
                case Utilities.BUTTON_1:
                    return Y56;
                case Utilities.BUTTON_2:
                    return B56;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R56;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },

    R61 {
    	public String jmeno = "S6-1'''";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - cervena + zluta\n"+
								"S2 - cervena\n"+
								"S3 - cervena\n"+
								"S4 - zelena\n"+
								"S5 - zluta\n"+
								"S6 - cervena\n"+
								"S7 - cervena\n"+
								"S8 - cervena\n"+
								"S9 - cervena\n";
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R1;
                case Utilities.BUTTON_1:
                	System.out.println("Nelze stisknou tl.1");
                    return R61;
                case Utilities.BUTTON_2:
                	System.out.println("Nelze stisknou tl.2");
                	return R61;
                case Utilities.BUTTON_3:
                	System.out.println("Nelze stisknou tl.3");
                	return R61;
                default:
                    return Fail;
            }
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    },

    Fail {    	
    	public String jmeno = "Fail";
    	public String cas = "t0 - 4 sekundy";
    	public String sviti = 	"S1 - zluta\n"+
    							"S2 - zluta\n"+
    							"S3 - zluta\n"+
    							"S4 - zluta\n"+
    							"S5 - zluta\n"+
    							"S6 - zluta\n"+
    							"S7 - cervena\n"+
    							"S8 - cervena\n"+
    							"S9 - cervena\n";
        @Override
        public State next(Character c) {
            System.out.println("Nepovolený stav");
            return Fail;
        }
        @Override
        public String toString(){
        	return "Jsem stav " + jmeno + ", budu zde po dobu " + cas + ", semafory sviti takto:\n" + sviti;
        }
    }
}
