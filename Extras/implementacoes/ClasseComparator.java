import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ClasseComparator {
    public static void main(String[] args) {
        Map<String, Pessoa> map = new TreeMap<>();
        map.put("pessoa1", new Pessoa("Jubileu"));
        map.put("pessoa2", new Pessoa("Pica Pau"));
        map.put("pessoa3", new Pessoa("Zeca Urubu"));
        System.out.println(map);
    }

    static class Pessoa implements Comparator<Pessoa> {

        private static int sequencia = 1;

        private Integer id;
        private String nome;

        public Pessoa(String nome) {
            this.nome = nome;
            this.id = sequencia++;
        }

        public Integer getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        @Override
        public int compare(ClasseComparator.Pessoa o1, ClasseComparator.Pessoa o2) {
            return Integer.compare(o1.id, o2.id);
        }

        @Override
        public String toString() {
            return "Pessoa [id=" + id + ", nome=" + nome + "]";
        }

    }
}