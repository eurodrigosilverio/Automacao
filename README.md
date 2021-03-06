# Automação do site das Lojas Americanas
As Lojas Americanas foi fundada em 1929 na cidade de Niterói-RJ pelo Austríaco Max Landesmann e pelos norte-americanos John Lee, Glen Matson, James Marshall e Batson Borger. A empresa conta com mais de 1700 estabelecimentos de vendas em todo o Brasil. É a quarta maior empresa varejista do país.

# Sobre
Esta automação foi desenvolvida para o site da empresa para testar os seguintes fluxos e mensagens: 

* Cadastrar novo usuário;
* Validar mensagem de e-mail já existente;
* Validar mensagem de senha fraca;
* Inserir CPF inválido e validar a mensagem de campo inválido;

# Tecnologias usadas
Foram utilizadas as seguintes tecnologias:

* Open JDK
* Eclipse IDE
* Navegador Chrome
* Git
* Selenium WebDriver
* Junit
* Linguagem de programação Java

# Como executar a automação?
Para executar a automação é necessário instalar e configurar as tecnologias utilizadas e, além disso, importar o projeto. O passo a passo é apresentado abaixo:

## Instalando as tecnologias

### Open JDK
Acesse o site do [Open JDK](https://jdk.java.net/14/), faça o download da última versão disponível (no projeto foi usada a 14.0.2) e instale. Caso o computador que irá executar a automação esteja rodando Windows 64 bits copie a versão *Windows / x64*. Caso seja Linux ou MacOS selecione as opções correspondentes.

### Eclipse IDE
Acesse o site do [Eclipse](https://www.eclipse.org/downloads/), faça o download e instale-o. Caso o computador que irá rodar a automação esteja com Windows 64 bits selecione a opção destacada no site (parte mais à esquerda da tela). Caso seja de 32 bits selecione [Download Packages](https://www.eclipse.org/downloads/packages/) e escolha a opção correspondente.

### Chrome
Acesse o site do [Navegador Chrome](https://www.google.com/chrome/), faça o download e instale-o.

### Git
Acesse o site do [Git](https://git-scm.com/downloads), faça o download de acordo com o sistema operacional utilizado e instale-o.

### Selenium WebDriver
Acesse o site do [Selenium](https://www.selenium.dev/downloads/) e localize a seção "Browser" (mais abaixo da tela). No projeto foi utilizado o Chrome Driver, por isso localize a opção Chrome e clique em [Documentation](https://github.com/operasoftware/operachromiumdriver/releases). Faça o download da versão correspondende a versão do seu navegador instalado anteriormente.

Descompacte o .zip em alguma pasta no seu computador. Para ficar alinhado com o projeto sugiro criar uma estrutura "C:\webdrivers\chromedriver\84"

*Notas:*

- A pasta 84 refere-se à versão do Chrome Driver copiado.
- Essa estrutura é referenciada no código para executar corretamente a chamada do navegador Chrome. Se descompactar o Chrome Driver em alguma estrutura diferente lembre-se de modificar no código.

## Importar o projeto do repositório
Importar o projeto diretamente do Eclipe cria toda a estrutura dentro da IDE. Para isso, siga os passos abaixo:

1. Abra o Eclipse e selecione o "Workspace". Pode-se deixar selecionado o padrão apresentado pelo IDE. 
*Nota:* Na imagem abaixo está o caminho criado para o projeto.

![Selecionando workspace](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%200.jpg)


2. Va até o menu Window > Show View > Other...

![Menu Other](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%201.jpg)


3. Na tela "Show View", selecione Git > Git Repositories e clique em "Open"

![ShowView](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%202.jpg)

4. Na parte inferior da janela do Eclipse será apresentada três opções, como apresentado na imagem abaixo. Clique na opção "Clone a Git repository"

![Clonar repositório](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%203.jpg)

5. A tela "Clone a Git repository" é apresentada. No campo "URI" digite o link do repositório (https://github.com/eurodrigosilverio/Automacao). Clique em "Next"

![Clonar repositório Git](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%204.jpg)

6. O clone do repositorio será feito. Clique novamente em "Next"

![Clonar repositorio 1](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%205.jpg)

7. Ainda na tela "Clone Git Repository" selecione a opção "Import all existing Eclipse after clone finishes". Clique em "Finish"

![Clonar repositorio 2](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%206.jpg)

7. O projeto é clonado. No canto inferior esquerdo da tela do Eclipse é apresentado o repositório. Clique com o botão direito do mouse em cima da pasta do repositório e selecione a opção "Import Projects"

![Projeto clonado](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%207.jpg)

8. A tela "Import Projects from File System or Archive" é apresentada. Clique em "Finish"

![Finalizar Importacao](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%208.jpg)

9. A estrutura do projeto é criada na parte superior esquerda do Eclipse. Navegue pela estrutura de pastas, como apresentada na imagem abaixo, e execute o arquivo "DesafioQA.java"

![Executar Arquivo](https://github.com/eurodrigosilverio/Automacao/blob/master/Importar%20Arquivos%20-%20Imagens/Importar%209.jpg)


### Autor
O Autor desse projeto é Rodrigo de Alencar Silvério.

