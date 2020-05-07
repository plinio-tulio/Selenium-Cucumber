# Projeto Base Desafio Selenium+Cucumber - Automação Web

- Projeto base para testes automatizados em Java com escrita utilizando a linguagem Gherkin e a abordagem BDD com framework Cucumber. Utilizado o Selenium WebDriver. 

### Pré-requisito para execução dos testes
Verificar a versão do seu navegador do Chrome. A versão utiliada no projeto é a 81. Caso esteja usando outra versão do navegador deve subistituir o driver no caminho resources/drivers.
Você pode estar baixando o driver referente a versão do navegador chrome utilizado em https://chromedriver.chromium.org/downloads.

### Geração de relatório de execução de teste 
Após a execução dos testessáo gerados dois tipos de relatório, um em html e o segundo em json. Eles ficam armazenados no path target > reports.

### Geração de screenshot 
Após a execução de cada cenário de teste uma foto da tela é capturada e armazenada no
no path target > screenshots.