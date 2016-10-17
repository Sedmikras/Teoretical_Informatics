package ToreticalInformatics;

enum States implements State {
    Init {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK: {
                    return G1;
                }
                default:
                    return Fail;
            }
        }
    },
    G1 {
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
    },
    G12 {
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
    },
    G2 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G23;
                case Utilities.BUTTON_2:
                    return B2;
                case Utilities.BUTTON_3:
                    return R2;
                default:
                    return Fail;
            }
        }
    },
    G23 {
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
    },
    G3 {
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
    },
    G34 {
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
    },
    G4 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G45;
                case Utilities.BUTTON_1:
                    return Y4;
                case Utilities.BUTTON_3:
                    return R4;
                default:
                    return Fail;
            }
        }
    },
    G45 {
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
    },
    G5 {
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
    },
    G56 {
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
    },
    G6 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G61;
                case Utilities.BUTTON_1:
                    return Y6;
                case Utilities.BUTTON_2:
                    return B6;

                default:
                    return Fail;
            }
        }
    },
    G61 {
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
    },

    Y1 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y12;
                case Utilities.BUTTON_2:
                    return B1;
                case Utilities.BUTTON_3:
                    return R1;
                default:
                    return Fail;
            }
        }
    },
    Y12 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G2;
                case Utilities.BUTTON_2:
                    return B12;
                case Utilities.BUTTON_3:
                    return R12;
                default:
                    return Fail;
            }
        }
    },
    Y23 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y3;
                default:
                    return Fail;
            }
        }
    },
    Y3 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y34;
                default:
                    return Fail;
            }
        }
    },
    Y34 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y4;
                default:
                    return Fail;
            }
        }
    },
    Y4 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y45;
                default:
                    return Fail;
            }
        }
    },
    Y45 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y5;
                default:
                    return Fail;
            }
        }
    },
    Y5 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y56;
                case Utilities.BUTTON_2:
                    return B5;
                default:
                    return Fail;
            }
        }
    },
    Y56 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y6;
                case Utilities.BUTTON_2:
                    return B56;
                default:
                    return Fail;
            }
        }
    },
    Y6 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y61;
                case Utilities.BUTTON_2:
                    return B6;
                default:
                    return Fail;
            }
        }
    },
    Y61 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y1;
                case Utilities.BUTTON_2:
                    return B61;
                case Utilities.BUTTON_3:
                    return R61;
                default:
                    return Fail;
            }
        }
    },

    B1 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B12;
                case Utilities.BUTTON_3:
                    return R1;
                default:
                    return Fail;
            }
        }
    },
    B12 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B2;
                case Utilities.BUTTON_3:
                    return R12;
                default:
                    return Fail;
            }
        }
    },
    B2 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B23;
                case Utilities.BUTTON_3:
                    return R2;
                default:
                    return Fail;
            }
        }
    },
    B23 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B3;
                case Utilities.BUTTON_1:
                    return Y23;
                case Utilities.BUTTON_3:
                    return R3;
                default:
                    return Fail;
            }
        }
    },
    B3 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B34;
                case Utilities.BUTTON_1:
                    return Y3;
                case Utilities.BUTTON_3:
                    return R3;
                default:
                    return Fail;
            }
        }
    },
    B34 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G4;
                case Utilities.BUTTON_1:
                    return Y34;
                case Utilities.BUTTON_3:
                    return R34;
                default:
                    return Fail;
            }
        }
    },
    B45 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B5;
                default:
                    return Fail;
            }
        }
    },
    B5 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B56;
                default:
                    return Fail;
            }
        }
    },
    B56 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B6;
                default:
                    return Fail;
            }
        }
    },
    B6 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B61;
                default:
                    return Fail;
            }
        }
    },
    B61 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return B1;

                case Utilities.BUTTON_3:
                    return R61;
                default:
                    return Fail;
            }
        }
    },

    R1 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R12;
                default:
                    return Fail;
            }
        }
    },
    R12 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R2;
                default:
                    return Fail;
            }
        }
    },
    R2 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R23;
                default:
                    return Fail;
            }
        }
    },
    R23 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R3;
                case Utilities.BUTTON_1:
                    return Y23;
                default:
                    return Fail;
            }
        }
    },
    R3 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R34;
                case Utilities.BUTTON_1:
                    return Y3;

                default:
                    return Fail;
            }
        }
    },
    R34 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R4;
                case Utilities.BUTTON_1:
                    return Y34;
                default:
                    return Fail;
            }
        }
    },
    R4 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R45;
                case Utilities.BUTTON_1:
                    return Y4;
                default:
                    return Fail;
            }
        }
    },
    R45 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R5;
                case Utilities.BUTTON_1:
                    return Y45;
                case Utilities.BUTTON_2:
                    return B45;
                default:
                    return Fail;
            }
        }
    },
    R5 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return Y56;
                case Utilities.BUTTON_1:
                    return Y5;
                case Utilities.BUTTON_2:
                    return B5;
                default:
                    return Fail;
            }
        }
    },
    R56 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return G6;
                case Utilities.BUTTON_1:
                    return Y56;
                case Utilities.BUTTON_2:
                    return B56;
                default:
                    return Fail;
            }
        }
    },

    R61 {
        @Override
        public State next(Character in) {
            switch (in) {
                case Utilities.BLANK:
                    return R1;
                default:
                    return Fail;
            }
        }
    },

    Fail {
        @Override
        public State next(Character c) {
            System.out.println("Nepovolený stav");
            return Fail;
        }
    }
}
