/**
 */
package collaborativemdeprocess.impl;

import collaborativemdeprocess.CollaborativemdeprocessPackage;
import collaborativemdeprocess.Participant;
import collaborativemdeprocess.Project;
import collaborativemdeprocess.Role;
import collaborativemdeprocess.Workgroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link collaborativemdeprocess.impl.ParticipantImpl#getId <em>Id</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ParticipantImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ParticipantImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ParticipantImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ParticipantImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ParticipantImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ParticipantImpl#getWorkgroups <em>Workgroups</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ParticipantImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * The cached value of the '{@link #getWorkgroups() <em>Workgroups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkgroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Workgroup> workgroups;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborativemdeprocessPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborativemdeprocessPackage.PARTICIPANT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborativemdeprocessPackage.PARTICIPANT__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborativemdeprocessPackage.PARTICIPANT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborativemdeprocessPackage.PARTICIPANT__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, CollaborativemdeprocessPackage.PARTICIPANT__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<Project>(Project.class, this, CollaborativemdeprocessPackage.PARTICIPANT__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workgroup> getWorkgroups() {
		if (workgroups == null) {
			workgroups = new EObjectResolvingEList<Workgroup>(Workgroup.class, this, CollaborativemdeprocessPackage.PARTICIPANT__WORKGROUPS);
		}
		return workgroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborativemdeprocessPackage.PARTICIPANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborativemdeprocessPackage.PARTICIPANT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case CollaborativemdeprocessPackage.PARTICIPANT__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollaborativemdeprocessPackage.PARTICIPANT__ID:
				return getId();
			case CollaborativemdeprocessPackage.PARTICIPANT__FIRST_NAME:
				return getFirstName();
			case CollaborativemdeprocessPackage.PARTICIPANT__EMAIL:
				return getEmail();
			case CollaborativemdeprocessPackage.PARTICIPANT__LAST_NAME:
				return getLastName();
			case CollaborativemdeprocessPackage.PARTICIPANT__ROLES:
				return getRoles();
			case CollaborativemdeprocessPackage.PARTICIPANT__PROJECTS:
				return getProjects();
			case CollaborativemdeprocessPackage.PARTICIPANT__WORKGROUPS:
				return getWorkgroups();
			case CollaborativemdeprocessPackage.PARTICIPANT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CollaborativemdeprocessPackage.PARTICIPANT__ID:
				setId((Long)newValue);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__EMAIL:
				setEmail((String)newValue);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__LAST_NAME:
				setLastName((String)newValue);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__WORKGROUPS:
				getWorkgroups().clear();
				getWorkgroups().addAll((Collection<? extends Workgroup>)newValue);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CollaborativemdeprocessPackage.PARTICIPANT__ID:
				setId(ID_EDEFAULT);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__ROLES:
				getRoles().clear();
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__PROJECTS:
				getProjects().clear();
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__WORKGROUPS:
				getWorkgroups().clear();
				return;
			case CollaborativemdeprocessPackage.PARTICIPANT__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CollaborativemdeprocessPackage.PARTICIPANT__ID:
				return id != ID_EDEFAULT;
			case CollaborativemdeprocessPackage.PARTICIPANT__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case CollaborativemdeprocessPackage.PARTICIPANT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case CollaborativemdeprocessPackage.PARTICIPANT__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case CollaborativemdeprocessPackage.PARTICIPANT__ROLES:
				return roles != null && !roles.isEmpty();
			case CollaborativemdeprocessPackage.PARTICIPANT__PROJECTS:
				return projects != null && !projects.isEmpty();
			case CollaborativemdeprocessPackage.PARTICIPANT__WORKGROUPS:
				return workgroups != null && !workgroups.isEmpty();
			case CollaborativemdeprocessPackage.PARTICIPANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", email: ");
		result.append(email);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
