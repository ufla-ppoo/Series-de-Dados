package series;

/**
 * Interface para definir o que uma Série de Dados deve ter.
 * 
 * Uma série de dados tem um intervalo de valores e valores inteiros correspondentes a cada intervalo.
 * 
 * Por questão de simplicidade os valores são representados por números inteiros.
 * Assim podemos ter dados, por exemplo, do valor 5 ao valor 30.
 * 
 * @author Julio César Alves
 */
public interface SerieDados {
    /**
     * Retorna uma string que representa o nome ou a identificação da série de
     * dados diários em questão.
     * 
     * @return Nome ou identificação da série de dados
     */
    String obterIdentificacaoSerie();
    
    /**
     * Retorna o primeiro valor para o qual a série tem dados. Exemplo: valor 5.
     * Considera-se que a série tem dados para todos os valores desde o valor inicial
     * até o valor final.
     * 
     * @return O primeiro valor que possui dados.
     */
    int obterInicioPeriodo();
    
    /**
     * Retorna o último valor para o qual a série tem dados. Exemplo: valor 21.
     * Considera-se que a série tem dados para todos os valores desde o valor inicial
     * até o valor final.
     * 
     * @return O último valor que possui dados.
     */
    int obterFimPeriodo();

    /**
     * Retorna o período em que os valores inicial e final estão vínculados
     * @return A períodicidade do intervalo
     */
    Periodicidade obterPeriodicidade();
    
    /**
     * Retorna o dado correspondente a um valor da série de dados.
     * Obs: seria mais eficiente o retorno de um conjunto de dados, mas está
     * assim por motivos didáticos.
     * 
     * @param valor Valor para o qual se deseja obter o dado correspondente.
     */
    int obterDado(int valor);
}
