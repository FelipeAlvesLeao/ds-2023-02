# Um software que lê um arquivo no formato CSV e, para cada linha, calcula a soma das duas primeiras colunas e gera um arquivo CSV, contendo as mesmas linhas, mas o arquivo gerado contém uma coluna adicional que a soma obtida para cada linha. 
Esse software deve ler o arquivo CSV (adicionar ao buffer) e, na primeira linha, adicionar (operação APPEND) um novo valor, que será uma nova coluna, chamado "soma".
A partir disso, irá fazer a iteração da linha 2 até a linha n e, em cada linha, fará a seguinte operação:
1. SPLIT do array de strings que é cada linha.
2. operação de soma com string[0] e string[1] 
3. checar se 2 foi um sucesso, se não, mensagem de erro. 
4. se sim, adicionar o valor da soma no fim do array de strings que compõe a linha, com certeza de adicionar a vírgula ",", que define a separação entre colunas da CSV.
