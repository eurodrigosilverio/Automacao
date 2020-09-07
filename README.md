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
* Selenium WebDriver
* Linguagem Java

# Como executar a automação?
Para executar a automação é necessário criar o ambiente necessário instalando e configurando as teclogias usadas. O passo a passo é apresentado abaixo:

### Open JDK

Acesse o site do [Open JDK](https://jdk.java.net/14/), faça o download da última versão disponível (no projeto foi usada a 14.0.2) e instale. Caso o computador que irá executar a automação esteja rodando Windows 64 bits copie a versão *Windows / x64*. Caso seja linux ou mac selecione as opções correspondentes.

### Eclipse IDE

Acesse o site do [Eclipse](https://www.eclipse.org/downloads/), faça o dowload e instale. Caso o computador que irá rodar a automação esteja rodando Windows 64 bits selecione a opção destacada no site (parte mais à esquerda da tela). Caso seja de 32 bits selecione [Download Packages](https://www.eclipse.org/downloads/packages/) e escolha a opção correspondente.

## Chrome

Acesse o site do [Navegador Chrome](https://www.google.com/chrome/), faça o download e instale.

## Selenium WebDriver

Acesse o site do [Selenium](https://www.selenium.dev/downloads/) e localize a seção "Browser" (mais abaixo da tela). No projeto foi utilizado o Chrome Driver, por isso localize a opção Chrome e clique em [Documentation](https://github.com/operasoftware/operachromiumdriver/releases). Faça o download da versão correspondende a versão do seu navegador instalado anteriormente.

Descompacte o .zip em alguma pasta no seu computador. Para ficar alinhado com o projeto sugiro criar uma estrutura "C:\webdrivers\chromedriver\84"

*Notas:*

- A pasta 84 refere-se a versão do Chrome Driver copiado.
- Essa estrutura é referenciada no código para executar corretamente a chamada do navegador Chrome. Se descompactar o Chomr Driver em alguma estrutura diferente lembre-se de modificar no código.
