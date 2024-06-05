package marinalucentini.entities;

//public class CreazioneEvento {
//    public static void avvioApplicazione(EntityManagerFactory emf) {
//        EntityManager em = emf.createEntityManager();
//        eventoDao event = new eventoDao(em);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Premi 1 per creare un evento, 2 per cercare l'evento, 3 per elminare l'evento");
//        int menuRisposta = Integer.parseInt(scanner.nextLine());
//
//        switch (menuRisposta) {
//            case 1: {
//                System.out.println("Dimmi il nome dell'evento che vuoi creare");
//                String title = scanner.nextLine();
//                System.out.println("La data dell'evento? ");
//                LocalDate date = LocalDate.parse(scanner.nextLine());
//                System.out.println("Descivi l'evento");
//                String description = scanner.nextLine();
//                System.out.println("Digita 1 se l'evento è pubblico, 2 se l'evento è privato");
//                int type = Integer.parseInt(scanner.nextLine());
//                tipoEvento tipoEvento = marinalucentini.enums.tipoEvento.PUBBLICO;
//                if (type == 1) {
//                    tipoEvento = marinalucentini.enums.tipoEvento.PUBBLICO;
//                } else if (type == 2) {
//                    tipoEvento = marinalucentini.enums.tipoEvento.PRIVATO;
//                }
//                System.out.println("Numero massimo di partecipanti?");
//                int maxUsers = Integer.parseInt(scanner.nextLine());
//                Evento evento = new Evento(title, date, description, tipoEvento, maxUsers);
//                event.save(evento);
//                break;
//            }
//            case 2: {
//                System.out.println("Dimmi l'id dell'evento da cercare");
//                UUID id = UUID.fromString(scanner.nextLine());
//
//                try {
//
//                    Evento evento = event.findById(id);
//                    System.out.println("L'evento trovato è " + evento.getTitolo());
//                } catch (eventoException ex) {
//                    System.out.println(ex.getMessage());
//                }
//                break;
//            }
//            case 3: {
//                System.out.println("Dimmi l'id dell'evento da cancellare");
//                UUID id = UUID.fromString(scanner.nextLine());
//
//                try {
//
//                    event.findAndRemovedById(id);
//                    System.out.println("L'evento è stato eliminato con successo!");
//                } catch (eventoException ex) {
//                    System.out.println(
//                            ex.getMessage());
//                }
//                break;
//            }
//            default: {
//
//                break;
//            }
//
//        }
//        scanner.close();
//        em.close();
//    }
//}
