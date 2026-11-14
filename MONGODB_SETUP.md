## Configuración de MongoDB

Antes de ejecutar EsZalud, es necesario configurar la variable de entorno `MONGODB_URI`, que contiene la cadena de conexión a MongoDB.

La aplicación utiliza esta variable para conectarse a la base de datos `salud_publica`.

### 1. Crear la variable de entorno en PowerShell

1. Abre una ventana de **Windows PowerShell**.
2. Ejecuta el siguiente comando, reemplazando `MiClave123` por la contraseña real del usuario de MongoDB:

```powershell
$env:MONGODB_URI="mongodb://admin:MiClave123@localhost:27017/salud_publica?authSource=admin"
```

3. La variable estará disponible en esa sesión de PowerShell.

### 2. Crear la variable de entorno en Command Prompt (CMD)

1. Abre una ventana del **Símbolo del sistema (Command Prompt)**.
2. Ejecuta el siguiente comando:

```cmd
set MONGODB_URI=mongodb://admin:MiClave123@localhost:27017/salud_publica?authSource=admin
```

3. La variable estará disponible en esa sesión de CMD.

### 3. Consideraciones importantes

- Reemplacen `MiClave123` por la contraseña correspondiente al usuario `admin` de MongoDB.
- Verifiquen que el servicio de MongoDB esté iniciado.
- No compartan públicamente cadenas de conexión que contengan contraseñas reales.
- La variable creada con `$env:` o `set` desaparece al cerrar la ventana de la consola.
