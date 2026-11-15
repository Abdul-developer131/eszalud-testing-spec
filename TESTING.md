# Documentación de Pruebas (TDD)

## Modelos Validados
Para el modelo **Paciente**, me asegure de que el documento no sea nulo ni venga vacio. Tambien validamos que los nombres y apellidos sean obligatorios, y que el correo electronico tenga un formato valido (que incluya el @).

En el caso del **Doctor**, comprobe que todo doctor tenga registrado su documento y su colegiatura de manera obligatoria. Para la **Especialidad**, verifique que no se pueda crear una sin su respectivo nombre.

Finalmente, para la **CitaMedica**, garantice que toda cita este vinculada si o si a un Paciente, un Doctor y una Fecha. Ademas, confirme que al registrarse, su estado inicial por defecto sea siempre PROGRAMADA.

## Enfoque de Desarrollo
Todo el proyecto fue construido siguiendo estrictamente el ciclo RED-GREEN-REFACTOR. Para proteger los datos y evitar alteraciones inesperadas, aplique inmutabilidad (usando la palabra reservada final) en las propiedades clave, logrando que los objetos de dominio sean mucho mas robustos y seguros.