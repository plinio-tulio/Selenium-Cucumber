# Projeto Base Desafio Selenium+Cucumber - Automação Web

- Projeto base para testes automatizados em Java com escrita utilizando a linguagem Gherkin e a abordagem BDD com framework Cucumber. Utilizado o Selenium WebDriver. 

### Pré-requisito para execução dos testes

1- Possuir o jdk instalado.

2- Baixar o projeto e importar na ide de sua preferência. Deve configurar para utilizar a versão mais atual do jre instalado na sua máquina.

3- Verificar a versão do seu navegador Chrome. A versão utilizada no projeto foi a 81. Caso esteja usando outra versão do navegador deve substituir o driver no caminho resources/drivers.
Você pode estar baixando o driver referente a versão do navegador chrome utilizado em https://chromedriver.chromium.org/downloads.

### Executando os testes
Os testes devem ser executados a partir das classes que estão dentro do pacote runners que está no caminho src/teste/java/br.com.automacao.runners.

### Geração de relatório de execução de teste 
Após a execução dos testes serão gerados dois tipos de relatório, um em html e o segundo em json. Eles ficam armazenados no path target > reports.

### Geração de screenshots 
Após a execução de cada cenário de teste uma foto da tela é capturada e armazenada
no path target > screenshots.
