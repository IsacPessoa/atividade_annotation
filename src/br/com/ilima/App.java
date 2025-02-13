package br.com.ilima;

public class App {

    public static void main(String[] args) {

        Class<ClasseAnnotation> clazz = ClasseAnnotation.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {

            Tabela tabela = clazz.getAnnotation(Tabela.class);

            System.out.println("Nome da tabela: " + tabela.value());

        } else {
            System.out.println("A classe não possui a anotação @Tabela.");
        }

    }

}
