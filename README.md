# Proyecto Alke Wallet - Java Android

## Descripción
Este proyecto consiste en una aplicación de "Billetera Digital" para dispositivos Android. La aplicación consta de 9 pantallas relacionadas que permiten al usuario realizar diversas acciones relacionadas con la gestión de su dinero de forma digital. Para la navegación entre las pantallas, se ha implementado lógica de programación utilizando intents. Cada pantalla está asociada a un activity en el cual se gestionan las acciones del usuario y se realizan las transiciones entre pantallas al hacer clic en los botones correspondientes.

## Pantallas
1. **Pantalla Splash Screen:** Pantalla principal de la aplicación. Se mantiene visible al inicio de la app durante 3 segundos y luego pasa a la pantalla "Login/Singup Page"

![image](https://github.com/Cintia-MV/AlkeWalletJavaAndroid/assets/99772130/0c5e21b8-8c17-4486-9428-19f2cac24d6d)

2. **Pantalla Login / Signup Page:** Los botones de esta pantalla nos dan la opción de ir a Singup Page para crear una cuenta o al login para iniciar sesión. Al dar clic en el botón "Crear cuenta" redirecciona a la pantalla Singup Page. Al dar clic en "Ya tiene cuenta" redirecciona a la pantalla Login Page.

![image](https://github.com/Cintia-MV/AlkeWalletJavaAndroid/assets/99772130/a8d92101-ea84-46ea-ab87-f2323efcd4d5)

3. **Pantalla Login Page:** Permite iniciar sesión ingresando usuario y contraseña.  Al dar clic en "Crear cuenta" redirecciona a la pantalla Singup Page. Al dar clic en el botón "Iniciar sesión" redirecciona a la pantalla Home Page-Empty Case.

![image](https://github.com/Cintia-MV/AlkeWalletJavaAndroid/assets/99772130/9f2b50d3-7fd0-40c5-b67a-16520b5e2d96)

4. **Pantalla Signup Page:** Permite al usuario crear una nueva cuenta de billetera digital. Al dar clic en botón "Crear cuenta" redirecciona a la pantalla Login Page. Al dar clic en "Ya tiene cuenta" redirecciona a la pantalla Login Page.

![image](https://github.com/Cintia-MV/AlkeWalletJavaAndroid/assets/99772130/36ab3c24-cf4d-48e3-933e-aefedd150739)

5. **Pantalla Home Page:** Muestra nombre, foto y saldo del usuario, junto con un historial de las últimas transacciones. Al dar clic en el botón "Enviar dinero" redirecciona a la pantalla Send Money. Al dar clic en "Ingresar dinero" redirecciona a la pantalla Request Money. Al dar clic en el nombre del usuario redirecciona a Profile Page.

![image](https://github.com/Cintia-MV/AlkeWalletJavaAndroid/assets/99772130/8c529e24-6824-414b-a6d8-4700a4512c5f)

6. **Pantalla Home Page - Empty Case:** Muestra los mismo datos que la pantalla Home Page, pero se muestra en caso que el usuario no haya realizado transacciones. Al dar clic en "Inicio" redirecciona a Home Page (momentáneamente, hasta que se implemente la lógica completa de cada pantalla). Al dar clic en el botón "Enviar dinero" redirecciona a la pantalla Send Money. Al dar clic en "Ingresar dinero" redirecciona a la pantalla Request Money. Al dar clic en el nombre del usuario redirecciona a Profile Page.

![image](https://github.com/Cintia-MV/AlkeWalletJavaAndroid/assets/99772130/07ee3c9a-2eb9-4780-a1c2-5df5a524e61a)

7. **Pantalla Profile Page:** Permite al usuario configurar su cuenta de billetera digital. 

![image](https://github.com/Cintia-MV/AlkeWalletJavaAndroid/assets/99772130/a3ca2463-19b6-4194-84f1-1a563e549a4e)

8. **Pantalla Send Money:**  Permite al usuario enviar dinero a otros usuarios.

![image](https://github.com/Cintia-MV/AlkeWalletJavaAndroid/assets/99772130/2d1990b1-a447-4238-a96e-a72c362f8bdc)

9. **Pantalla Request Money:** Permite al usuario solicitar dinero a otros usuarios.

![image](https://github.com/Cintia-MV/AlkeWalletJavaAndroid/assets/99772130/b4e04b04-c540-4fae-a8d6-f753a6296656)

## Autor
Este proyecto fue desarrollado por Cintia Muñoz Valdés.
