/**
 */
package collaborativemdeprocess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link collaborativemdeprocess.Participant#getId <em>Id</em>}</li>
 *   <li>{@link collaborativemdeprocess.Participant#getFirstName <em>First Name</em>}</li>
 *   <li>{@link collaborativemdeprocess.Participant#getEmail <em>Email</em>}</li>
 *   <li>{@link collaborativemdeprocess.Participant#getLastName <em>Last Name</em>}</li>
 *   <li>{@link collaborativemdeprocess.Participant#getRoles <em>Roles</em>}</li>
 *   <li>{@link collaborativemdeprocess.Participant#getProjects <em>Projects</em>}</li>
 *   <li>{@link collaborativemdeprocess.Participant#getWorkgroups <em>Workgroups</em>}</li>
 *   <li>{@link collaborativemdeprocess.Participant#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getParticipant_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link collaborativemdeprocess.Participant#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getParticipant_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link collaborativemdeprocess.Participant#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getParticipant_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link collaborativemdeprocess.Participant#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getParticipant_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link collaborativemdeprocess.Participant#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link collaborativemdeprocess.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getParticipant_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link collaborativemdeprocess.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getParticipant_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Workgroups</b></em>' reference list.
	 * The list contents are of type {@link collaborativemdeprocess.Workgroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workgroups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workgroups</em>' reference list.
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getParticipant_Workgroups()
	 * @model
	 * @generated
	 */
	EList<Workgroup> getWorkgroups();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getParticipant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link collaborativemdeprocess.Participant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Participant
