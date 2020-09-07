# Automação do site das Lojas Americanas
As Lojas Americanas foi fundada em 1929 na cidade de Niterói-RJ pelo Austríaco Max Landesmann e pelos norte-americanos John Lee, Glen Matson, James Marshall e Batson Borger. A empresa conta com mais de 1700 estabelecimentos de vendas em todo o Brasil. É a quarta maior empresa varejista do país.

# Sobre
Esta automação foi desenvolvida para o site da empresa para testar os seguintes fluxos e mensagens: 

* Cadastrar novo usuário
* Validar mensagem de e-mail já existente
* Validar mensagem senha fraca
* Inserir CPF inválido e validar a mensagem campo inválido

# Tecnologias usadas
Foram utilizadas as seguintes tecnologias para a automação:

* Open JDK
* Eclipse IDE
* Chrome
* Git
* Selenium WebDriver
* Junit
* Linguagem Java

# Como executar a automação?
Para executar a automação é necessário criar o ambiente necessário instalando, configurando as tecnologias usadas e, além disso, importar o projeto do repositório. O passo a passo é apresentado abaixo:
## Instalando as tecnologias

### Open JDK
Acesse o site do [Open JDK](https://jdk.java.net/14/), faça o download da última versão disponível (no projeto foi usada a 14.0.2) e instale. Caso o computador que irá executar a automação esteja rodando Windows 64 bits copie a versão *Windows / x64*. Caso seja linux ou mac selecione as opções correspondentes.

### Eclipse IDE
Acesse o site do [Eclipse](https://www.eclipse.org/downloads/), faça o download e instale-o. Caso o computador que irá rodar a automação esteja rodando Windows 64 bits selecione a opção destacada no site (parte mais à esquerda da tela). Caso seja de 32 bits selecione [Download Packages](https://www.eclipse.org/downloads/packages/) e escolha a opção correspondente.

### Chrome
Acesse o site do [Navegador Chrome](https://www.google.com/chrome/), faça o download e instale.

### Git
Acesse o site de download do [Git](https://git-scm.com/downloads), faça o download de acordo com o sistema operacional utilizado e instale-o.

### Selenium WebDriver
Acesse o site do [Selenium](https://www.selenium.dev/downloads/) e localize a seção "Browser" (mais abaixo da tela). No projeto foi utilizado o Chrome Driver, por isso localize a opção Chrome e clique em [Documentation](https://github.com/operasoftware/operachromiumdriver/releases). Faça o download da versão correspondende a versão do seu navegador instalado anteriormente.

Descompacte o .zip em alguma pasta no seu computador. Para ficar alinhado com o projeto sugiro criar uma estrutura "C:\webdrivers\chromedriver\84"

*Notas:*

- A pasta 84 refere-se à versão do Chrome Driver copiado.
- Essa estrutura é referenciada no código para executar corretamente a chamada do navegador Chrome. Se descompactar o Chrome Driver em alguma estrutura diferente lembre-se de modificar no código.

## Importar o projeto do repositório
Importar o projeto diretamente do eclipe cria toda a estrutura dentro da IDE. Para isso, siga os passos abaixo:

1. Abra o Eclipse e selecione o "workspace". Pode-se deixar selecionado o padrão apresentado pelo Eclipe.

![Selecionando workspace](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%200.jpg)


2. Va até o menu Windown > Show View > Other

![Menu Other](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%201.jpg)


3. Na tela "Show View", selecione Git > Git Repositories e clique em "Abrir"

![ShowView](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%202.jpg)

4. Na parte inferior da janela do Eclipse será apresentada uma opção de clonar o repositório

![Clonar repositório](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%203.jpg)




