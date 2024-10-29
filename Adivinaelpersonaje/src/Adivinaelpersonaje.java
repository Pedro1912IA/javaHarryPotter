import javax.swing.*;

public class Adivinaelpersonaje {

    public static void main(String[] args) {
    	String personajeCorrecto, pregunta, respuestaCorrecta, casas, criaturas,res;
    	
        String[] personajes = {"Harry Potter", "Hermione", "Ron", "Dumbledore", "Snape"};
        
        String[][] preguntasRespuestas = {
                {"¿Tiene una cicatriz en la frente?", "sí"},
                {"¿Es el mejor amigo de Harry?", "no"},
                {"¿Es la persona más inteligente de su clase?", "no"},
                {"¿Es el director de Hogwarts?", "no"},
                {"¿Es profesor de Pociones?", "no"},
                

                {"¿Tiene una cicatriz en la frente?", "no"},
                {"¿Es el mejor amigo de Harry?", "no"},
                {"¿Es la persona más inteligente de su clase?", "sí"},
                {"¿Es el director de Hogwarts?", "no"},
                {"¿Es profesor de Pociones?", "no"},
                

                {"¿Tiene una cicatriz en la frente?", "no"},
                {"¿Es el mejor amigo de Harry?", "sí"},
                {"¿Es la persona más inteligente de su clase?", "no"},
                {"¿Es el director de Hogwarts?", "no"},
                {"¿Es profesor de Pociones?", "no"},
                

                {"¿Tiene una cicatriz en la frente?", "no"},
                {"¿Es el mejor amigo de Harry?", "no"},
                {"¿Es la persona más inteligente de su clase?", "no"},
                {"¿Es el director de Hogwarts?", "sí"},
                {"¿Es profesor de Pociones?", "no"},
                

                {"¿Tiene una cicatriz en la frente?", "no"},
                {"¿Es el mejor amigo de Harry?", "no"},
                {"¿Es la persona más inteligente de su clase?", "no"},
                {"¿Es el director de Hogwarts?", "no"},
                {"¿Es profesor de Pociones?", "sí"},
                
                
             
            };
        
        do {
        
        JOptionPane.showMessageDialog(null,
        		"Bienvenidos al mundo de Harry Potter \n \nNos encontramos en el castillo de Hogwarts, escenario principal donde transcurre la saga. \nAl entrar, primero disfrutaremos del banquete de bienvenida y después con el sombrero seleccionador, elegiremos nuestra casa: \nGryffindor, Hufflepuff, Slytherin o Ravenclaw \nSe jugará a Adivinar el Personaje. \nPosteriormente encontrará el libro de criaturas magicas para conocerlas. \nPor último, se brindará información adicional de los libros y peliculas dde Harry Potter. \nComencemos!",
        		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
        		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/castillohogwarts.jpg")));
        
        JOptionPane.showMessageDialog(null,"¡Bienvenidos a Hogwarts! \n \nDespués del festín de bienvenida, llega el momento emocionante de la selección de casas. \nEl Sombrero Seleccionador les ayudará a encontrar el lugar perfecto para ustedes. \nHogwarts fue fundado por Godric Gryffindor, Helga Hufflepuff, Rowena Ravenclaw y Salazar Slytherin. \nPrepárense para una aventura mágica en su nueva casa. \n¡Que comience la magia!",
        		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
        		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/logohogwarts.jpg")));
        
        JOptionPane.showMessageDialog(null,"El Sombrero Seleccionador \n \nUn antiguo y sabio artefacto mágico, ha llegado el momento de revelar su propósito. \nCon su voz susurrante y una chispa de magia en cada palabra \nEl sombrero les ofrece la oportunidad de elegir la casa que mejor se adapte a sus deseos y aspiraciones. \nSin imponer ni decidir por ustedes, el Sombrero Seleccionador confía en su intuición y valor para escoger. \nEste es el inicio de una nueva aventura, y el sombrero está listo para acompañarles en este emocionante viaje. \n¡Hagan su elección y den el primer paso hacia su nueva casa en Hogwarts!",
        		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
        		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/sombreroseleccionador.png")));
            
        
        casas=(String)JOptionPane.showInputDialog(null, "¿Qué casa quiere elegir?", "El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,new ImageIcon(Adivinaelpersonaje.class.getResource("/img/hogwarts.jpg")), null, null);
        
        if (casas.equalsIgnoreCase("Gryffindor")) {
        	JOptionPane.showMessageDialog(null,
            		"Gryffindor \n \nEs una de las casas más emblemáticas de Hogwarts, conocida por su valiente espíritu y coraje inquebrantable. \nFundada por Godric Gryffindor, esta casa valora la valentía, la determinación y el honor. \nSus miembros son famosos por su disposición a enfrentar desafíos con valentía y por su lealtad a sus amigos. \nEl emblema de Gryffindor es un león dorado, símbolo de su fuerza y nobleza, y su color característico es el rojo. \nLos estudiantes de Gryffindor suelen ser líderes naturales, siempre dispuestos a luchar por lo que creen justo y a defender a quienes lo necesitan. \nEn esta casa, la audacia y el heroísmo son cualidades que se celebran y se fomentan.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/gryffindor.jpg")));
		} else if (casas.equalsIgnoreCase("Hufflepuff")){
			JOptionPane.showMessageDialog(null, "Hufflepuff \n \nEs una de las casas más queridas de Hogwarts, conocida por su dedicación, lealtad y trabajo arduo. \nFundada por Helga Hufflepuff, esta casa valora la honestidad, la justicia y la perseverancia. \nSus miembros son reconocidos por su capacidad para colaborar y su compromiso con el bienestar de los demás. \nEl emblema de Hufflepuff es un tejón, símbolo de su tenacidad y humildad, y sus colores son el amarillo y el negro. \nLos estudiantes de Hufflepuff son conocidos por su amabilidad y su disposición para trabajar en equipo, destacándose en todas las áreas de la vida escolar con un enfoque constante y una actitud positiva.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/hufflepuff.jpg")));
		} else if (casas.equalsIgnoreCase("Slytherin")){
			JOptionPane.showMessageDialog(null,"Slytherin \n \nEs una de las casas más ambiciosas y estratégicas de Hogwarts, fundada por Salazar Slytherin. \nEsta casa valora la astucia, la ambición y la habilidad para tomar decisiones difíciles con un enfoque pragmático. \nSus miembros son conocidos por su capacidad para liderar y su deseo de alcanzar grandes logros. \nEl emblema de Slytherin es una serpiente plateada, simbolizando su inteligencia y su habilidad para adaptarse a cualquier situación, y sus colores son el verde y el plata. \nLos estudiantes de Slytherin a menudo se destacan por su determinación y su habilidad para superar obstáculos, buscando siempre el éxito y la excelencia en sus esfuerzos.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/slytherin.jpg")));

		} else if (casas.equalsIgnoreCase("Ravenclaw")){
			JOptionPane.showMessageDialog(null,
            		"Ravenclaw \n \nEs una de las casas más respetadas de Hogwarts, conocida por su énfasis en la sabiduría y la inteligencia. \nFundada por Rowena Ravenclaw, esta casa valora el conocimiento, la creatividad y el pensamiento crítico. \nSus miembros son reconocidos por su curiosidad intelectual y su habilidad para resolver problemas complejos. \nEl emblema de Ravenclaw es un águila plateada, símbolo de su agudeza mental y su aspiración a la excelencia, y sus colores son el azul y el plata. \nLos estudiantes de Ravenclaw se destacan por su pasión por el aprendizaje y su capacidad para pensar de manera innovadora, siempre buscando expandir sus horizontes y comprender el mundo a un nivel más profundo.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/ravenclaw.jpg")));

		} else {
			JOptionPane.showMessageDialog(null, "Error al ingresar");
		}
        
        
        JOptionPane.showMessageDialog(null,
        		"Juego de Adivina el personaje de la Saga Harry Potter \n  \nEl juego consiste en adivinar el personaje. \nSe van a hacer preguntas y dependiendo de las respuesta, se puede descifrar. \nQue comienza la magia!",
        		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
        		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/personajesimagen.jpg")));

        int indiceAleatorio = (int) (Math.random() * personajes.length);
        personajeCorrecto = personajes[indiceAleatorio];

        for (int i = 0; i < 5; i++) {
            pregunta = preguntasRespuestas[indiceAleatorio * 5 + i][0];
            respuestaCorrecta = preguntasRespuestas[indiceAleatorio * 5 + i][1];

            String[] opciones = {"Sí", "No"};
            int sel = JOptionPane.showOptionDialog(null, pregunta, "El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            switch (sel) {
                case 0:
                    if (respuestaCorrecta.equalsIgnoreCase("sí")) {
                        JOptionPane.showMessageDialog(null, "¡Correcto!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto");
                    }
                    break;
                case 1: 
                    if (respuestaCorrecta.equalsIgnoreCase("no")) {
                        JOptionPane.showMessageDialog(null, "¡Correcto!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto");
                    }
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "No se completaron todas las preguntas.");
                    break;
            }
        }

        String respuestaFinal = JOptionPane.showInputDialog("¿Quién es este personaje?");
        if (respuestaFinal != null) {
            if (respuestaFinal.equalsIgnoreCase(personajeCorrecto)) {
                JOptionPane.showMessageDialog(null, "¡Ganaste! Es " + personajeCorrecto);
            } else {
                JOptionPane.showMessageDialog(null, "Perdiste. Era " + personajeCorrecto);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresó ninguna respuesta.");
        }
    
    
        do {
        
        criaturas=(String)JOptionPane.showInputDialog(null, "En el universo de Harry Potter, \nlos magos y brujas tienen acceso a una amplia gama de información sobre criaturas mágicas a través de libros especializados, \nsiendo uno de los más populares Animales Fantásticos y Dónde Encontrarlos de Newt Scamander. \nEste libro es una guía completa sobre la vida mágica, ofreciendo descripciones detalladas de diversas criaturas, sus hábitats, y sus características. \nAquí hay una lista de algunas de las criaturas mágicas más destacadas mencionadas: \n1-Dragones \n2-Fénixes \n3-Elfos domésticos \n4-Centauros \n5-Basiliscos \n6-Hippogrífos \n7-Duendecillos \n8-Acromántulas \n9-Trolls \n10-Lechuzas \n \nSeleccione para mayor información de la criatura magica \nPuede ser tanto el nombre o el número ", "El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,new ImageIcon(Adivinaelpersonaje.class.getResource("/img/criaturaslibros.jpg")), null, null);
        
        if (criaturas.equalsIgnoreCase("Dragones") || criaturas.equals("1")) {
        	JOptionPane.showMessageDialog(null,
            		"Los dragones son majestuosos y poderosos, con grandes alas, escamas duras y la capacidad de escupir fuego. \nCada especie tiene características distintas; por ejemplo, el Dragón Húngaro Horntail es conocido por su agresividad y colas afiladas, mientras que el Dragón Chino de Cresta de Jade tiene escamas verdes y es menos hostil. \nSon criaturas raras y valiosas, a menudo usadas en la elaboración de pociones y en competiciones mágicas como el Torneo de los Tres Magos.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/dragones.jpeg")));
		} else if (criaturas.equalsIgnoreCase("Fenixes") || criaturas.equals("2")){
			JOptionPane.showMessageDialog(null, "Los fénixes son aves mágicas con plumas doradas y rojas, famosas por su habilidad de renacer de sus cenizas después de morir. \nSu canto tiene propiedades curativas, y sus plumas son muy apreciadas en la magia. \nEl Fénix de Dumbledore, Fawkes, juega un papel crucial en la serie, \nasistiendo a Harry y sus amigos en momentos difíciles y proporcionando una pluma para la varita de Harry.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/fenix.jpeg")));
		} else if (criaturas.equalsIgnoreCase("Elfos domesticos") || criaturas.equals("3")){
			JOptionPane.showMessageDialog(null,"Estos seres pequeños tienen orejas grandes y habilidades mágicas limitadas, y suelen trabajar en casas de brujas y magos. \nSon leales a sus amos y tienen un fuerte sentido del deber. \nPersonajes como Dobby y Kreacher tienen roles significativos en la serie, destacando temas de lealtad, libertad y la lucha contra la opresión.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/elfo.jpeg")));

		} else if (criaturas.equalsIgnoreCase("Centauros") || criaturas.equals("4")){
			JOptionPane.showMessageDialog(null,
            		" Los centauros tienen el cuerpo de un caballo y el torso humano. \nSon conocidos por su sabiduría, habilidades de predicción y su vida en la naturaleza. \nViven en el Bosque Prohibido y tienen una relación compleja con los magos. \nFirenze, uno de ellos, se convierte en profesor de Hogwarts, mostrando la intersección entre el mundo mágico y el salvaje.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/centauro.jpg")));
		} else if (criaturas.equalsIgnoreCase("Basiliscos") || criaturas.equals("5")){
			JOptionPane.showMessageDialog(null,
            		"Estas serpientes gigantes tienen la capacidad de petrificar a sus víctimas con la mirada y su veneno es extremadamente letal. \nEl Basilisco de la Cámara Secreta es central para la trama de ese libro, \n ya que es controlado por Tom Riddle para aterrorizar a los estudiantes de Hogwarts y es clave en la resolución del misterio de la Cámara.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/basilisco.jpeg")));
		} else if (criaturas.equalsIgnoreCase("Hippogrifos") || criaturas.equals("6")){
			JOptionPane.showMessageDialog(null,
            		"Los hippogrífos tienen el cuerpo de un caballo y la cabeza de un águila, y son conocidos por su orgullo y rapidez. \nBuckbeak, uno de los hippogrífos, juega un papel importante en Harry Potter y el Prisionero de Azkaban, \ny su historia refleja temas de justicia y respeto, destacando la necesidad de tratar a estas criaturas con dignidad.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/hipogrifo.jpg")));
		} else if (criaturas.equalsIgnoreCase("Duendecillos") || criaturas.equals("7")){
			JOptionPane.showMessageDialog(null,
            		"Pequeños y traviesos, los duendecillos se encargan de tareas específicas, como trabajar en la Banca Gringotts. \nSon hábiles con las monedas y tienen una aversión a los humanos. \nSu papel en la economía mágica es crucial, y personajes como Griphook tienen influencia en la serie, \nespecialmente en las tramas relacionadas con la banca y las riquezas.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/dundecilllo.jpeg")));
		} else if (criaturas.equalsIgnoreCase("Acromantulas") || criaturas.equals("8")){
			JOptionPane.showMessageDialog(null,
            		" Estas arañas gigantes tienen inteligencia y habilidades mágicas. \nViven en el Bosque Prohibido y son temidas por su tamaño y veneno. \nAragog, el líder de una colonia de acromántulas, juega un rol importante en Harry Potter y la Cámara Secreta, \nrepresentando la amenaza que acecha en el bosque y el peligro oculto que enfrentan los protagonistas.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/araña.jpg")));
		} else if (criaturas.equalsIgnoreCase("Trolls") || criaturas.equals("9")){
			JOptionPane.showMessageDialog(null,
            		"Los trolls son criaturas grandes y torpes, conocidas por su gran fuerza y mal temperamento. \nExisten varias especies, incluyendo trolls de piedra y trolls de montaña. Uno aparece en Harry Potter y la Piedra Filosofal y se convierte en una prueba para Harry y sus amigos. \nLos trolls también se mencionan en el contexto de peligros que enfrentan los magos y la necesidad de estar siempre preparados.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/troll.jpeg")));
		} else if (criaturas.equalsIgnoreCase("Lechuzas") || criaturas.equals("10")){
			JOptionPane.showMessageDialog(null,
            		"En el mundo de Harry Potter, las lechuzas son aves ampliamente utilizadas para la entrega de correo. \nEstas aves tienen la habilidad de encontrar a los destinatarios sin importar la distancia, lo que las hace esenciales para la comunicación entre magos y brujas. \nLa lechuza más conocida es Hedwig, la mascota de Harry Potter, una lechuza blanca que le es regalada como regalo de cumpleaños al principio de la serie. \nHedwig no solo es un medio de comunicación, sino también una compañera leal para Harry. \nLas lechuzas simbolizan la conexión y la lealtad en el mundo mágico, y su presencia es constante a lo largo de toda la serie.",
            		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
            		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/lechuza.jpeg")));

		} else {
			JOptionPane.showMessageDialog(null, "Error al ingresar");
		}
        
        res = JOptionPane.showInputDialog("¿Quiere volver a ver el libro de ciraturas magicas? si/no");

        } while (!res.equalsIgnoreCase("no"));

        
        JOptionPane.showMessageDialog(null,"Los libros de Harry Potter \n \nEscritos por J.K. Rowling, siguen las emocionantes y mágicas aventuras del joven mago Harry Potter a lo largo de siete años en la escuela de magia y hechicería de Hogwarts. \nLa serie comienza con Harry Potter y la Piedra Filosofal, donde Harry descubre su herencia mágica y su lugar en el mundo de los magos. \nEn Harry Potter y la Cámara Secreta, enfrenta un misterio oscuro que pone en peligro a los estudiantes de Hogwarts. \nHarry Potter y el Prisionero de Azkaban lo lleva a descubrir secretos de su pasado y a enfrentar a un peligroso fugitivo. \nHarry Potter y el Cáliz de Fuego presenta un torneo mágico que desafía a los estudiantes y marca un punto crucial en la lucha contra el mal. \nEn Harry Potter y la Orden del Fénix, Harry y sus amigos se unen a una resistencia secreta contra el oscuro mago Lord Voldemort. \nHarry Potter y el Misterio del Príncipe profundiza en la historia de Voldemort y en los sacrificios necesarios para derrotarlo. \nFinalmente, Harry Potter y las Reliquias de la Muerte concluye la saga con una épica batalla entre el bien y el mal, donde Harry enfrenta su destino y busca cabar con Voldemort. \nLa serie ha capturado la imaginación de millones, abordando temas de amistad, valentía y la lucha entre el bien y el mal en un mundo lleno de magia y misterio.",
        		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
        		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/librosharrypotter.jpg")));
        
        JOptionPane.showMessageDialog(null,"Las películas de Harry Potter \n \nbasadas en los populares libros de J.K. Rowling, adaptan la épica saga del joven mago al cine, llevándonos a un mundo de magia y aventura. \nComenzando con Harry Potter y la Piedra Filosofal (2001), cada película sigue el crecimiento de Harry Potter y sus amigos a lo largo de sus años en Hogwarts. \nDesde Harry Potter y la Cámara Secreta (2002) hasta Harry Potter y las Reliquias de la Muerte – Parte 2 (2011), las películas exploran la lucha de Harry contra el oscuro mago Lord Voldemort y sus seguidores. \nLas adaptaciones cinematográficas son conocidas por su impresionante diseño de producción, efectos visuales innovadores y una banda sonora evocadora. \nCon un elenco estelar y una dirección que combina drama, acción y magia, las películas han consolidado a la serie como un fenómeno cultural, resonando tanto con fanáticos nuevos como con los ya existentes.",
        		"El mundo de Harry Potter", JOptionPane.DEFAULT_OPTION,
        		new ImageIcon(Adivinaelpersonaje.class.getResource("/img/pelisharrypotter.jpg")));

        res = JOptionPane.showInputDialog("¿Quiere volver al Mundo de Harry Potter? si/no");

    } while (!res.equalsIgnoreCase("no"));

    JOptionPane.showMessageDialog(null, "El mundo de Harry Potter ha terminado. Gracias por participar!");
        
    }
}