# Java Polimorfismo: Entendiendo Herencia e Interfaces
### Java Orientado a Objetos G5 - ONE | Proyecto Bytebank-heredado

<p>
Algunos temas vistos:
</p>

- Herencia
- Instancias
- Polimorfismo
- Interfaces
- Métodos abstractos
- Composición de objetos

Entre otros... 

```
public class com.bytebank.modelo.cliente.Cliente implements com.bytebank.modelo.Autenticable { ... }
public class com.bytebank.modelo.Administrador extends com.bytebank.modelo.Funcionario implementes com.bytebank.modelo.Autenticable { ... }
```

El objetivo es llegar a tener en concepto de código el siguiente diagrama:
- La lógica de auntenticación está isolada en __AutenticacionUtil__
- La lógica de cómo yo inicio sesión está en __SistemaInterno__ (él decide quién entra y quién sale)
- Y quién marca si soy elegible para entrar o salir? es __Autenticable__
![Texto alternativo](https://raw.githubusercontent.com/FerNicolas117/Images/main/Diagrama-Bytebanck-heredado.png?token=GHSAT0AAAAAACDE4JR3DXOA35VF3CXBHG6QZFXMFUA)
