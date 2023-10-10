import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Endereco {
    String rua;
    String setor;
    int cep;
    String cidade;
}
