## Lista de Exercícios 04

### Questão 1

a) **Verdadeiro.** 

b) **Verdadeiro.** 

c) **Falso.** Quando uma subclasse redefine um método da superclasse com a mesma assinatura, isso se chama override, não sobrecarga. Sobrecarga ocontece quando há múltiplos métodos com o mesmo nome, mas parâmetros diferentes.

---

### Questão 2

O acesso `protected` permite que subclasses tenham acesso direto aos membros da superclasse, o que facilita a reutilização de código e a extensão da funcionalidade. Porém, isso pode quebrar o encapsulamento, pois expõe detalhes internos da superclasse.

O acesso `private`, por outro lado, protege totalmente os membros da superclasse, mantendo o encapsulamento forte. Isso obriga o uso de getters e setters para acessar ou modificar atributos, mantendo o controle sobre como os dados são manipulados.

**Conclusão:** `private` favorece o encapsulamento e a manutenção segura, enquanto `protected` favorece a extensibilidade. A escolha depende do equilíbrio desejado entre proteção e reutilização.

---

### Questão 3

Em hierarquias de herança, quando um objeto de uma subclasse é criado, o construtor da superclasse deve ser chamado primeiro (implícita ou explicitamente) para garantir que os atributos herdados sejam inicializados corretamente.

Se a chamada ao construtor da superclasse não for feita explicitamente com `super()`, o compilador automaticamente tentará chamar o construtor padrão (sem parâmetros). Se esse construtor não existir, ocorrerá erro de compilação.

**Motivo:** A superclasse define parte do estado do objeto, e essa parte precisa estar completamente inicializada antes que a subclasse possa adicionar sua própria lógica de inicialização.

---

As questões 4 e 5 envolvem código e serão respondidas a seguir.
