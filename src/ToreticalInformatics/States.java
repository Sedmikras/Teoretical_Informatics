package ToreticalInformatics;

enum States implements State {
    Init {
        private String name = "S0     ";
        private String duration = " --- doba trvání: to (4 sekundy)";
        private String lights = "O | O | O | O | O | O | Č | Č | Č ";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G1 {
        private String name = "s1     ";
        private String duration = " --- doba trvání: t1 (20sekund)";
        private String lights = "Z | Č | Z | Z | Č | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G12 {
        private String name = "S1-2   ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Z | Č | Z | O | Č | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G2 {
        private String name = "s2     ";
        private String duration = " --- doba trvání: t1 (20sekund)";
        private String lights = "Z | Č | Z | Č | Č | Č | Č | Č | Z";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G23 {
        private String name = "S2-3   ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Z | Č+O | O | Č | Č| Č+O | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G3 {
        private String name = "s3     ";
        private String duration = " --- doba trvání: t1 (20sekund)";
        private String lights = "Z | Z | Č | Č | Č | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G34 {
        private String name = "S3-4   ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "O | Z | Č | Č | Č | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G4 {
        private String name = "s4     ";
        private String duration = " --- doba trvání: t1 (20sekund)";
        private String lights = "Č | Z | Č | Č | Č | Z | Č | Z | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G45 {
        private String name = "S4-5   ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | O | Č | Č+O | Č+O | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G5 {
        private String name = "s5     ";
        private String duration = " --- doba trvání: t1 (20sekund)";
        private String lights = "Č | Č | Č | Z | Z | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G56 {
        private String name = "S5-6   ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | Č | Č | Z | Z | O | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G6 {
        private String name = "s6     ";
        private String duration = " --- doba trvání: t1 (20sekund)";
        private String lights = "Č | Č | Č | Z | Z | Č | Z | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    G61 {
        private String name = "S6-1   ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | Č | Č | Z | O | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },

    Y1 {
        private String name = "S1'    ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Z | Č | Z | Z | Č | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    Y12 {
        private String name = "S1-2'  ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Z | Č | Z | O | Č | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    Y23 {
        private String name = "S2-3'  ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Z | Č+O | O | Č | Č| Č+O | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    Y3 {
        private String name = "S3'    ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Z | Z | Č | Č | Č | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    Y34 {
        private String name = "S3-4'  ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "O | Z | Č | Č | Č | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    Y4 {
        private String name = "S4'    ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Č | Z | Č | Č | Č | Z | Č | Z | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    Y45 {
        private String name = "S4-5'  ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | O | Č | Č+O | Č+O | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    Y5 {
        private String name = "S5'    ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Č | Č | Č | Z | Z | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    Y56 {
        private String name = "S5-6'  ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | Č | Č | Z | Z | O | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    Y6 {
        private String name = "S6'    ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Č | Č | Č | Z | Z | Č | Z | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    Y61 {
        private String name = "S6-1'  ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | Č | Č | Z | O | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },

    B1 {
        private String name = "S1''   ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Z | Č | Z | Z | Č | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    B12 {
        private String name = "S1-2'' ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Z | Č | Z | O | Č | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    B2 {
        private String name = "S2''   ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Z | Č | Z | Č | Č | Č | Č | Č | Z";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    B23 {
        private String name = "S2-3'' ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Z | Č+O | O | Č | Č| Č+O | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    B3 {
        private String name = "S3''   ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Z | Z | Č | Č | Č | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    B34 {
        private String name = "S3-4'' ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "O | Z | Č | Č | Č | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    B45 {
        private String name = "S4-5'' ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | O | Č | Č+O | Č+O | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    B5 {
        private String name = "S5''   ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Č | Č | Č | Z | Z | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    B56 {
        private String name = "S5-6'' ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | Č | Č | Z | Z | O | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    B6 {
        private String name = "S6''   ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Č | Č | Č | Z | Z | Č | Z | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    B61 {
        private String name = "S6-1'' ";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | Č | Č | Z | O | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },

    R1 {
        private String name = "S1'''  ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Z | Č | Z | Z | Č | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    R12 {
        private String name = "S1-2'''";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Z | Č | Z | O | Č | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    R2 {
        private String name = "S2'''  ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Z | Č | Z | Č | Č | Č | Č | Č | Z";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    R23 {
        private String name = "S2-3'''";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Z | Č+O | O | Č | Č| Č+O | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    R3 {
        private String name = "S3'''  ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Z | Z | Č | Č | Č | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    R34 {
        private String name = "S3-4'''";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "O | Z | Č | Č | Č | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    R4 {
        private String name = "S4'''  ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Č | Z | Č | Č | Č | Z | Č | Z | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    R45 {
        private String name = "S4-5'''";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | O | Č | Č+O | Č+O | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    R5 {
        private String name = "S5'''  ";
        private String duration = " --- doba trvání: t2 (15sekund)";
        private String lights = "Č | Č | Č | Z | Z | Z | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    R56 {
        private String name = "S5-6'''";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | Č | Č | Z | Z | O | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },
    R61 {
        private String name = "S6-1'''";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "Č | Č | Č | Z | O | Č | Č | Č | Č";

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
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    },

    Fail {
        private String name = "Fail";
        private String duration = " --- doba trvání: to(4sekundy)";
        private String lights = "O | O | O | O | O | O | Č | Č | Č";

        @Override
        public State next(Character c) {
            System.out.println("Nepovolený stav");
            return Fail;
        }

        @Override
        public String toString() {
            return this.name + " : " + this.lights + this.duration;
        }
    }
}
