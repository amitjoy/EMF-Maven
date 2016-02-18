/**
 */
package collaborativemdeprocess.impl;

import collaborativemdeprocess.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborativemdeprocessFactoryImpl extends EFactoryImpl implements CollaborativemdeprocessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollaborativemdeprocessFactory init() {
		try {
			CollaborativemdeprocessFactory theCollaborativemdeprocessFactory = (CollaborativemdeprocessFactory)EPackage.Registry.INSTANCE.getEFactory(CollaborativemdeprocessPackage.eNS_URI);
			if (theCollaborativemdeprocessFactory != null) {
				return theCollaborativemdeprocessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CollaborativemdeprocessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativemdeprocessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CollaborativemdeprocessPackage.PROJECT: return createProject();
			case CollaborativemdeprocessPackage.PARTICIPANT: return createParticipant();
			case CollaborativemdeprocessPackage.WORKGROUP: return createWorkgroup();
			case CollaborativemdeprocessPackage.ROLE: return createRole();
			case CollaborativemdeprocessPackage.SESSION: return createSession();
			case CollaborativemdeprocessPackage.MDE_PROCESS: return createMDEProcess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workgroup createWorkgroup() {
		WorkgroupImpl workgroup = new WorkgroupImpl();
		return workgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session createSession() {
		SessionImpl session = new SessionImpl();
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDEProcess createMDEProcess() {
		MDEProcessImpl mdeProcess = new MDEProcessImpl();
		return mdeProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativemdeprocessPackage getCollaborativemdeprocessPackage() {
		return (CollaborativemdeprocessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CollaborativemdeprocessPackage getPackage() {
		return CollaborativemdeprocessPackage.eINSTANCE;
	}

} //CollaborativemdeprocessFactoryImpl
