QUESTÃO 4
Proponha um problema em que o uso do padrão de projeto Proxy seja adequado. O 
problema deve ser diferente dos exemplos vistos em sala de aula. Implemente o problema 
proposto para demonstrar o funcionamento. Utilize comentários para elucidar melhor sua 
proposta. 
Lembre-se: 
  - no padrão de projeto proxy existe um objeto intermediário entre cliente e um objeto base; -
  - clientes não "falam" com o objeto base (diretamente). Eles têm que passar antes pelo proxy; 
  - um proxy possui a mesma interface que o seu objeto base. 
Os comentários no código são essenciais para indicar: quem é seu objeto base? Quem é 
seu cliente? Quem é seu proxy? 


Problema Proposto:
Imagine um sistema de câmeras de segurança.
O objeto base é a CameraReal, que conecta ao dispositivo e transmite vídeo.
O proxy é a CameraProxy, que controla o acesso à câmera real, verificando permissões de usuário antes de permitir a conexão.
O cliente é quem tenta acessar a câmera.
Assim, o Proxy funciona como um intermediário de segurança, garantindo que apenas usuários autorizados possam acessar a câmera.
