import org.junit.Test;

@Test
public class EnderecoTeste {
    Endereco testeEndereco = Endereco.builder().cep(32131).rua("Rua").setor("Setor").cidade("Goiania").build();
    assertThat(testeEndereco.getrua()).isEqualTo("Rua");
}
