/**
 */
package collaborativemdeprocess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link collaborativemdeprocess.Role#getId <em>Id</em>}</li>
 *   <li>{@link collaborativemdeprocess.Role#getName <em>Name</em>}</li>
 *   <li>{@link collaborativemdeprocess.Role#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
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
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getRole_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link collaborativemdeprocess.Role#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

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
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link collaborativemdeprocess.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link collaborativemdeprocess.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see collaborativemdeprocess.CollaborativemdeprocessPackage#getRole_Participants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Participant> getParticipants();

} // Role
