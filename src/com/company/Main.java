package com.company;

public class Main {

    public static void main(String[] args) {
	TypeQuest unique = new TypeQuest() {
        public void addNewType() {
            System.out.println("added question with free answer");
        }
    };
        unique.addNewType();

        new TypeQuest(71){
        private String name="Drag&Drop";
            public void addNewType(){
                System.out.println("added"+getName());
            }
            String getName() {
                return name;
            }
            }.addNewType();
        TypeQuest standard=new TypeQuest(35);
        standard.addNewType();
    }
    }

