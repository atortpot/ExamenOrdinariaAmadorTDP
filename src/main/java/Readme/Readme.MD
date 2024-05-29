# Documentación de Sistemas de Glamour Beauty

## Tabla de Contenidos
1. [Sistema Financiero para Preparación de IPO](#sistema-financiero-para-preparación-de-ipo)
2. [Sistema de Formación y Seguimiento Académico](#sistema-de-formación-y-seguimiento-académico)
3. [Sistema de Gestión de Eventos](#sistema-de-gestión-de-eventos)

---

## Sistema Financiero para Preparación de IPO

### Descripción
El Sistema Financiero está diseñado para asistir a Glamour Beauty en la preparación para su IPO. Incluye funcionalidades para gestionar los precios de las acciones en diferentes mercados financieros, calcular valores de mercado y determinar ratios precio-valor en libros.

### Componentes
- **GlamourFinancial**: Interfaz que define las operaciones financieras esenciales.
- **FinancialModel**: Implementación de la interfaz `GlamourFinancial` que maneja los datos y cálculos de precios de acciones.

### Uso
El sistema permite actualizar y recuperar precios de acciones, calcular el valor de mercado total basado en acciones en circulación y computar el ratio precio-valor en libros. Este modelo ayuda a tomar decisiones financieras informadas antes de la IPO.

---

## Sistema de Formación y Seguimiento Académico

### Descripción
Este sistema gestiona la formación y el desarrollo de los empleados de Glamour Beauty, esencial para la preparación del personal en torno a la IPO. Soporta la gestión de cursos, registros académicos de empleados y emisión de certificados.

### Componentes
- **Subject**: Representa una asignatura individual dentro de un curso.
- **Course**: Compuesto por múltiples asignaturas.
- **Employee**: Incluye detalles personales y un registro académico.
- **AcademicRecord**: Rastrea las asignaturas tomadas por un empleado, sus calificaciones y certificados obtenidos.
- **TrainingSystem**: Sistema central para inscribir empleados en cursos, actualizar calificaciones y emitir certificados.

### Uso
Los empleados se inscriben en cursos, se califican y pueden recibir certificados basados en su rendimiento académico. El sistema ayuda a organizar y rastrear todos los esfuerzos educativos para capacitar eficientemente a la fuerza laboral.

---

## Sistema de Gestión de Eventos

### Descripción
El Sistema de Gestión de Eventos está diseñado para organizar y supervisar los eventos internos de la empresa. Maneja la programación de eventos, el registro de asistentes y la recopilación de feedback.

### Componentes
- **Event**: Entidad principal que representa un evento.
- **Attendee**: Detalles sobre una persona que asiste a un evento.
- **Feedback**: Feedback proporcionado por los asistentes sobre un evento.
- **EventView**: Interfaz para interacciones de usuarios y visualización.
- **EventController**: Gestiona la creación de eventos, registro de asistentes y procesamiento de feedback.

### Uso
Utiliza este sistema para crear eventos, registrar asistentes y recopilar valioso feedback para mejorar eventos futuros. Este sistema asegura que todos los eventos estén bien documentados y gestionados eficientemente.

---

## Información General

### Tecnologías Utilizadas
- Java: Lenguaje de programación principal.
- UML: Utilizado para diseñar y documentar la arquitectura del sistema.

### Configuración e Instalación
1. Clonar el repositorio.
2. Navegar al directorio del proyecto.
3. Compilar los archivos Java con `javac`.
4. Ejecutar las clases principales para cada sistema para iniciar las aplicaciones.

### Contribución
Agradecemos las contribuciones de la comunidad. Por favor, envía tus pull requests a los subdirectorios correspondientes para cada sistema.

### Licencia
Este proyecto está licenciado bajo la Licencia MIT - ver el archivo LICENSE.md para detalles.

---

## Contacto
Para más soporte o información, por favor contacta a info@glamourbeauty.com.

¡Gracias por usar o contribuir a los Sistemas de Glamour Beauty!

``
