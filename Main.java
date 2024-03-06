import java.util.HashSet;
import java.util.Set;
    
    
    public class Main {
        public static void main(String[] args) {
            // Richiamo della funzione per ottenere un HashSet riempito
            Set<String> filledHashSet = getFilledHashSet();
    
            // Creazione di un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
            String elementToRemove = "smartphone";
            Set<String> setWithSameType = new HashSet<>(filledHashSet);
            setWithSameType.add(elementToRemove);
    
            // Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
            for (String element : setWithSameType) {
                if (element.equals(elementToRemove)) {
                    setWithSameType.remove(element);
                    break; // Esci dal ciclo dopo aver rimosso l'elemento
                }
            }
    
            // Svuotare l'hashset
            filledHashSet.clear();
    
            // Verificare e stampare il risultato
            System.out.println( filledHashSet.isEmpty());
        }
    
        
        public static Set<String> getFilledHashSet() {
            Set<String> set = new HashSet<>();
            set.add("smartphone");
            set.add("pc");
            set.add("tablet");
            return set;
        }
    } 
