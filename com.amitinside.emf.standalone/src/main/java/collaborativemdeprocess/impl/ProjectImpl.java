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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link collaborativemdeprocess.impl.ProjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ProjectImpl#getWorkgroups <em>Workgroups</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ProjectImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link collaborativemdeprocess.impl.ProjectImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkgroups() <em>Workgroups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkgroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Workgroup> workgroups;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participants;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborativemdeprocessPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborativemdeprocessPackage.PROJECT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborativemdeprocessPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborativemdeprocessPackage.PROJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workgroup> getWorkgroups() {
		if (workgroups == null) {
			workgroups = new EObjectContainmentEList<Workgroup>(Workgroup.class, this, CollaborativemdeprocessPackage.PROJECT__WORKGROUPS);
		}
		return workgroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant>(Participant.class, this, CollaborativemdeprocessPackage.PROJECT__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, CollaborativemdeprocessPackage.PROJECT__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborativemdeprocessPackage.PROJECT__WORKGROUPS:
				return ((InternalEList<?>)getWorkgroups()).basicRemove(otherEnd, msgs);
			case CollaborativemdeprocessPackage.PROJECT__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case CollaborativemdeprocessPackage.PROJECT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case CollaborativemdeprocessPackage.PROJECT__ID:
				return getId();
			case CollaborativemdeprocessPackage.PROJECT__NAME:
				return getName();
			case CollaborativemdeprocessPackage.PROJECT__DESCRIPTION:
				return getDescription();
			case CollaborativemdeprocessPackage.PROJECT__WORKGROUPS:
				return getWorkgroups();
			case CollaborativemdeprocessPackage.PROJECT__PARTICIPANTS:
				return getParticipants();
			case CollaborativemdeprocessPackage.PROJECT__ROLES:
				return getRoles();
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
			case CollaborativemdeprocessPackage.PROJECT__ID:
				setId((Long)newValue);
				return;
			case CollaborativemdeprocessPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case CollaborativemdeprocessPackage.PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CollaborativemdeprocessPackage.PROJECT__WORKGROUPS:
				getWorkgroups().clear();
				getWorkgroups().addAll((Collection<? extends Workgroup>)newValue);
				return;
			case CollaborativemdeprocessPackage.PROJECT__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case CollaborativemdeprocessPackage.PROJECT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case CollaborativemdeprocessPackage.PROJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case CollaborativemdeprocessPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CollaborativemdeprocessPackage.PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CollaborativemdeprocessPackage.PROJECT__WORKGROUPS:
				getWorkgroups().clear();
				return;
			case CollaborativemdeprocessPackage.PROJECT__PARTICIPANTS:
				getParticipants().clear();
				return;
			case CollaborativemdeprocessPackage.PROJECT__ROLES:
				getRoles().clear();
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
			case CollaborativemdeprocessPackage.PROJECT__ID:
				return id != ID_EDEFAULT;
			case CollaborativemdeprocessPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CollaborativemdeprocessPackage.PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CollaborativemdeprocessPackage.PROJECT__WORKGROUPS:
				return workgroups != null && !workgroups.isEmpty();
			case CollaborativemdeprocessPackage.PROJECT__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case CollaborativemdeprocessPackage.PROJECT__ROLES:
				return roles != null && !roles.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
