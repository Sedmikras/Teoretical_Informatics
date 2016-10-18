package TeoreticalInformatics;

enum States implements State {
    Init {
        private String name = "S0     ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "O | O | O | O | O | O | Č | Č | Č ";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G1;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Init;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return Init;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return Init;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G1 {
        private String name = "S1     ";
        private String duration = "t1 (20 sekund)";
        private String lights = "Z | Č | Z | Z | Č | Č | Č | Č | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G12;
                case Utilities.BUTTON_0:
                    return Y1;
                case Utilities.BUTTON_1:
                    return B1;
                case Utilities.BUTTON_2:
                    return R1;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G12 {
        private String name = "S1-2   ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Z | Č | Z | O | Č | Č | Č | Č | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G2;
                case Utilities.BUTTON_0:
                    return Y12;
                case Utilities.BUTTON_1:
                    return B12;
                case Utilities.BUTTON_2:
                    return R12;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G2 {
        private String name = "S2     ";
        private String duration = "t1 (20 sekund)";
        private String lights = "Z | Č | Z | Č | Č | Č | Č | Č | Z";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G23;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return G2;
                case Utilities.BUTTON_1:
                    return B2;
                case Utilities.BUTTON_2:
                    return R2;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G23 {
        private String name = "S2-3   ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Z | Č+O | O | Č | Č| Č+O | Č | Č | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G3;
                case Utilities.BUTTON_0:
                    return Y23;
                case Utilities.BUTTON_1:
                    return B23;
                case Utilities.BUTTON_2:
                    return R23;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G3 {
        private String name = "S3     ";
        private String duration = "t1 (20 sekund)";
        private String lights = "Z | Z | Č | Č | Č | Z | Č | Č | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G34;
                case Utilities.BUTTON_0:
                    return Y3;
                case Utilities.BUTTON_1:
                    return B3;
                case Utilities.BUTTON_2:
                    return R3;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G34 {
        private String name = "S3-4   ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "O | Z | Č | Č | Č | Z | Č | Č | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G4;
                case Utilities.BUTTON_0:
                    return Y34;
                case Utilities.BUTTON_1:
                    return B34;
                case Utilities.BUTTON_2:
                    return R34;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G4 {
        private String name = "S4     ";
        private String duration = "t1 (20 sekund)";
        private String lights = "Č | Z | Č | Č | Č | Z | Č | Z | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G45;
                case Utilities.BUTTON_0:
                    return Y4;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return G4;
                case Utilities.BUTTON_2:
                    return R4;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G45 {
        private String name = "S4-5   ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | O | Č | Č+O | Č+O | Z | Č | Č | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G5;
                case Utilities.BUTTON_0:
                    return Y45;
                case Utilities.BUTTON_1:
                    return B45;
                case Utilities.BUTTON_2:
                    return R45;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G5 {
        private String name = "S5     ";
        private String duration = "t1 (20 sekund)";
        private String lights = "Č | Č | Č | Z | Z | Z | Č | Č | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G56;
                case Utilities.BUTTON_0:
                    return Y5;
                case Utilities.BUTTON_1:
                    return B5;
                case Utilities.BUTTON_2:
                    return R5;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G56 {
        private String name = "S5-6   ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | Č | Č | Z | Z | O | Č | Č | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G6;
                case Utilities.BUTTON_0:
                    return Y56;
                case Utilities.BUTTON_1:
                    return B56;
                case Utilities.BUTTON_2:
                    return R56;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G6 {
        private String name = "S6     ";
        private String duration = "t1 (20 sekund)";
        private String lights = "Č | Č | Č | Z | Z | Č | Z | Č | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G61;
                case Utilities.BUTTON_0:
                    return Y6;
                case Utilities.BUTTON_1:
                    return B6;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return G6;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    G61 {
        private String name = "S6-1   ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | Č | Č | Z | O | Č | Č | Č | Č";
        private String button = "Žádné";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G1;
                case Utilities.BUTTON_0:
                    return Y61;
                case Utilities.BUTTON_1:
                    return B61;
                case Utilities.BUTTON_2:
                    return R61;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },

    Y1 {
        private String name = "S1'    ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Z | Č | Z | Z | Č | Č | Č | Č | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y12;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y1;
                case Utilities.BUTTON_1:
                    return B1;
                case Utilities.BUTTON_2:
                    return R1;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    Y12 {
        private String name = "S1-2'  ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Z | Č | Z | O | Č | Č | Č | Č | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G2;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y12;
                case Utilities.BUTTON_1:
                    return B12;
                case Utilities.BUTTON_2:
                    return R12;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    Y23 {
        private String name = "S2-3'  ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Z | Č+O | O | Č | Č| Č+O | Č | Č | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y3;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y23;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return Y23;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return Y23;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    Y3 {
        private String name = "S3'    ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Z | Z | Č | Č | Č | Z | Č | Č | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y34;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y3;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return Y3;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return Y3;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    Y34 {
        private String name = "S3-4'  ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "O | Z | Č | Č | Č | Z | Č | Č | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y4;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y34;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return Y34;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return Y34;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    Y4 {
        private String name = "S4'    ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Č | Z | Č | Č | Č | Z | Č | Z | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y45;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y4;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return Y4;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return Y4;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    Y45 {
        private String name = "S4-5'  ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | O | Č | Č+O | Č+O | Z | Č | Č | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y5;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y45;
                case Utilities.BUTTON_1:
                    return B45;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return Y45;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    Y5 {
        private String name = "S5'    ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Č | Č | Č | Z | Z | Z | Č | Č | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y56;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y5;
                case Utilities.BUTTON_1:
                    return B5;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return Y5;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    Y56 {
        private String name = "S5-6'  ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | Č | Č | Z | Z | O | Č | Č | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y6;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y56;
                case Utilities.BUTTON_1:
                    return B56;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return Y56;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    Y6 {
        private String name = "S6'    ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Č | Č | Č | Z | Z | Č | Z | Č | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y61;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y6;
                case Utilities.BUTTON_1:
                    return B6;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return Y6;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    Y61 {
        private String name = "S6-1'  ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | Č | Č | Z | O | Č | Č | Č | Č";
        private String button = "1";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y1;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return Y61;
                case Utilities.BUTTON_1:
                    return B61;
                case Utilities.BUTTON_2:
                    return R61;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },

    B1 {
        private String name = "S1''   ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Z | Č | Z | Z | Č | Č | Č | Č | Č";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B12;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return B1;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B1;
                case Utilities.BUTTON_2:
                    return R1;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    B12 {
        private String name = "S1-2'' ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Z | Č | Z | O | Č | Č | Č | Č | Č";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B2;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return B12;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B12;
                case Utilities.BUTTON_2:
                    return R12;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    B2 {
        private String name = "S2''   ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Z | Č | Z | Č | Č | Č | Č | Č | Z";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B23;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return B2;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B2;
                case Utilities.BUTTON_2:
                    return R2;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    B23 {
        private String name = "S2-3'' ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Z | Č+O | O | Č | Č| Č+O | Č | Č | Č";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B3;
                case Utilities.BUTTON_0:
                    return Y23;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B23;
                case Utilities.BUTTON_2:
                    return R3;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    B3 {
        private String name = "S3''   ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Z | Z | Č | Č | Č | Z | Č | Č | Č";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B34;
                case Utilities.BUTTON_0:
                    return Y3;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B3;
                case Utilities.BUTTON_2:
                    return R3;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    B34 {
        private String name = "S3-4'' ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "O | Z | Č | Č | Č | Z | Č | Č | Č";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G4;
                case Utilities.BUTTON_0:
                    return Y34;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B34;
                case Utilities.BUTTON_2:
                    return R34;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    B45 {
        private String name = "S4-5'' ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | O | Č | Č+O | Č+O | Z | Č | Č | Č";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B5;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return B45;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B45;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return B45;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    B5 {
        private String name = "S5''   ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Č | Č | Č | Z | Z | Z | Č | Č | Č";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B56;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return B5;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B5;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return B5;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    B56 {
        private String name = "S5-6'' ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | Č | Č | Z | Z | O | Č | Č | Č";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B6;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return B56;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B56;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return B56;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    B6 {
        private String name = "S6''   ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Č | Č | Č | Z | Z | Č | Z | Č | Č";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B61;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return B6;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B6;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return B6;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    B61 {
        private String name = "S6-1'' ";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | Č | Č | Z | O | Č | Č | Č | Č";
        private String button = "2";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B1;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return B61;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return B61;
                case Utilities.BUTTON_2:
                    return R61;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },

    R1 {
        private String name = "S1'''  ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Z | Č | Z | Z | Č | Č | Č | Č | Č";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R12;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return R1;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return R1;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R1;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    R12 {
        private String name = "S1-2'''";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Z | Č | Z | O | Č | Č | Č | Č | Č";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R2;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return R12;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return R12;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R12;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    R2 {
        private String name = "S2'''  ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Z | Č | Z | Č | Č | Č | Č | Č | Z";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R23;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return R2;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return R2;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R2;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    R23 {
        private String name = "S2-3'''";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Z | Č+O | O | Č | Č| Č+O | Č | Č | Č";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R3;
                case Utilities.BUTTON_0:
                    return Y23;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return R23;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R23;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    R3 {
        private String name = "S3'''  ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Z | Z | Č | Č | Č | Z | Č | Č | Č";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R34;
                case Utilities.BUTTON_0:
                    return Y3;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return R3;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R3;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    R34 {
        private String name = "S3-4'''";
        private String duration = "t0 (4 sekundy)";
        private String lights = "O | Z | Č | Č | Č | Z | Č | Č | Č";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R4;
                case Utilities.BUTTON_0:
                    return Y34;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return R34;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R34;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    R4 {
        private String name = "S4'''  ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Č | Z | Č | Č | Č | Z | Č | Z | Č";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R45;
                case Utilities.BUTTON_0:
                    return Y4;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return R4;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R4;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    R45 {
        private String name = "S4-5'''";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | O | Č | Č+O | Č+O | Z | Č | Č | Č";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R5;
                case Utilities.BUTTON_0:
                    return Y45;
                case Utilities.BUTTON_1:
                    return B45;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R45;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    R5 {
        private String name = "S5'''  ";
        private String duration = "t2 (15 sekund)";
        private String lights = "Č | Č | Č | Z | Z | Z | Č | Č | Č";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R56;
                case Utilities.BUTTON_0:
                    return Y5;
                case Utilities.BUTTON_1:
                    return B5;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R5;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    R56 {
        private String name = "S5-6'''";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | Č | Č | Z | Z | O | Č | Č | Č";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G6;
                case Utilities.BUTTON_0:
                    return Y56;
                case Utilities.BUTTON_1:
                    return B56;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R56;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },
    R61 {
        private String name = "S6-1'''";
        private String duration = "t0 (4 sekundy)";
        private String lights = "Č | Č | Č | Z | O | Č | Č | Č | Č";
        private String button = "3";

        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R1;
                case Utilities.BUTTON_0:
                    System.out.println("Nelze stisknou tl.1");
                    return R61;
                case Utilities.BUTTON_1:
                    System.out.println("Nelze stisknou tl.2");
                    return R61;
                case Utilities.BUTTON_2:
                    System.out.println("Nelze stisknou tl.3");
                    return R61;
                default:
                    return Fail;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + " --- doba trvání: " + this.duration + ", stisknuté tlačítko: " + this.button;
        }
    },

    Fail {
        private String name = "Fail";
        private String duration = "t nekonečno";
        private String lights = "Č | Č | Č | Č | Č | Č | Č | Č | Č";
        private String button = "Špatné";

        @Override
        public State next(Character c) {
            System.out.println("Nepovolený stav, restartuji semafory");
            return Init;
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    }
}
