package CursoJava.orm;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

class HopitalORM {

    public static void main(String[] args) {
        // Configuración de Hibernate
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Operaciones CRUD con doctores
        DoctorDAO doctorDAO = new DoctorDAO(sessionFactory);

        // Alta de doctor
        Doctor newDoctor = new Doctor("Nuevo Doctor", 30, "Neurología");
        doctorDAO.saveDoctor(newDoctor);

        // Modificación de doctor
        Doctor doctorToUpdate = doctorDAO.getDoctorById(1);
        doctorToUpdate.setEspecialidad("Cardiólogo");
        doctorDAO.updateDoctor(doctorToUpdate);

        // Baja de doctor
        doctorDAO.deleteDoctor(2);

        // Obtener lista de doctores
        List<Doctor> doctors = doctorDAO.getAllDoctors();
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

        // Operaciones CRUD con pacientes
        PatientDAO patientDAO = new PatientDAO(sessionFactory);

        // Alta de paciente
        Patient newPatient = new Patient("Nuevo Paciente", 25, "Ninguno", new Date(), 1);
        patientDAO.savePatient(newPatient);

        // Modificación de paciente
        Patient patientToUpdate = patientDAO.getPatientById(10);
        patientToUpdate.setHistorialMedico("Historial actualizado");
        patientDAO.updatePatient(patientToUpdate);

        // Baja de paciente
        patientDAO.deletePatient(15);

        // Obtener lista de pacientes
        List<Patient> patients = patientDAO.getAllPatients();
        for (Patient patient : patients) {
            System.out.println(patient);
        }

        // Cierre de la sesión de Hibernate
        sessionFactory.close();
    }
}

class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Crea la factoría de sesiones a partir de hibernate.cfg.xml
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();
            Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
            sessionFactory = metadata.getSessionFactoryBuilder().build();
        } catch (Throwable ex) {
            // Maneja errores de inicialización de la factoría de sesiones
            System.err.println("Error al inicializar la factoría de sesiones: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}


@Entity
@Table(name = "doctores")
class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @Column(name = "especialidad")
    private String especialidad;

    public Doctor(String nuevoDoctor, int i, String neurologia) {
        this.nombre = nuevoDoctor;
        this.edad = i;
        this.especialidad = neurologia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Constructor, getters y setters
}

@Entity
@Table(name = "pacientes")
class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @Column(name = "historial_medico")
    private String historialMedico;

    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    @Column(name = "doctor")
    private int doctor;

    public Patient(String nuevoPaciente, int i, String ninguno, Date date, int i1) {
        this.nombre = nuevoPaciente;
        this.edad = i;
        this.historialMedico = ninguno;
        this.fechaIngreso = date;
        this.doctor = i1;
    }

    public void setHistorialMedico(String historialActualizado) {
        this.historialMedico = historialActualizado;
    }

    // Constructor, getters y setters
}

class DoctorDAO {
    private final SessionFactory sessionFactory;

    public DoctorDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // Métodos CRUD para doctores
    public void saveDoctor(Doctor doctor) {
        // Implementa la lógica para guardar un doctor en la base de datos
    }

    public Doctor getDoctorById(int id) {
        // Implementa la lógica para obtener un doctor por ID de la base de datos
        return null;
    }

    public void updateDoctor(Doctor doctor) {
        // Implementa la lógica para actualizar un doctor en la base de datos
    }

    public void deleteDoctor(int id) {
        // Implementa la lógica para eliminar un doctor de la base de datos
    }

    public List<Doctor> getAllDoctors() {
        // Implementa la lógica para obtener todos los doctores de la base de datos
        return null;
    }
}

class PatientDAO {
    private final SessionFactory sessionFactory;

    public PatientDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // Métodos CRUD para pacientes
    public void savePatient(Patient patient) {
        // Implementa la lógica para guardar un paciente en la base de datos
    }

    public Patient getPatientById(int id) {
        // Implementa la lógica para obtener un paciente por ID de la base de datos
        return null;
    }

    public void updatePatient(Patient patient) {
        // Implementa la lógica para actualizar un paciente en la base de datos
    }

    public void deletePatient(int id) {
        // Implementa la lógica para eliminar un paciente de la base de datos
    }

    public List<Patient> getAllPatients() {
        // Implementa la lógica para obtener todos los pacientes de la base de datos
        return null;
    }
}
