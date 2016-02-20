package client;

import java.util.Iterator;
import java.util.Objects;
import observer.Observer1;
import observer.Observer2;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import production.MyWeb;
import production.ProductionFactory;
import production.ProductionPackage;
import production.Webpage;
import emfswitch.Switch;

public class App {

	public static EObject createEObject(final String nsURI, final String name) {
		final EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
		final EClass eClass = (EClass) ePackage.getEClassifier(name);
		return EcoreUtil.create(eClass);
	}

	public static void findObectContainer(final EObject eObject) {
		final Iterator<EReference> iterator = eObject.eClass().getEAllReferences().iterator();

		while (iterator.hasNext()) {
			final EReference reference = iterator.next();
			Objects.nonNull(reference);

			if (reference.isContainer()) {
				System.out.println(eObject.eGet(reference));
			}
		}
	}

	public static void getStructuralFeature(final EObject eObject, final String featureName) {
		final EStructuralFeature feature = eObject.eClass().getEStructuralFeature(featureName);
		System.out.println(eObject.eGet(feature));
	}

	public static void listAllContainedValues(final EObject eObject) {
		final Iterator<?> containmentIterator = eObject.eContents().iterator();
		while (containmentIterator.hasNext()) {
			final EObject feature = (EObject) containmentIterator.next();
			System.out.println(feature);
		}
	}

	public static void main(final String[] args) {

		final String nsURI = "http://www.example.org/production";
		// System.out.println(createEObject(nsURI, "Article"));

		final MyWeb web = ProductionFactory.eINSTANCE.createMyWeb();
		web.setName("Mera Web");
		web.eAdapters().add(new Observer1());
		web.eAdapters().add(new Observer2());
		printAttributeValues(web);
		setStructuralFeatureValueReflectively(web, ProductionPackage.Literals.MY_WEB__NAME.getName());
		printAttributeValues(web);
		getStructuralFeature(web, ProductionPackage.Literals.MY_WEB__NAME.getName());
		listAllContainedValues(web);
		final Webpage page = ProductionFactory.eINSTANCE.createWebpage();
		final EStructuralFeature feature = page.eClass()
				.getEStructuralFeature(ProductionPackage.Literals.WEBPAGE__NAME.getName());
		System.out.println(feature);
		System.out.println(page);
		final EClass eClass = ProductionPackage.Literals.WEBPAGE;
		System.out.println(EcoreUtil.create(eClass));
		System.out.println(page.eGet(feature));
		new Switch().doSwitch(web);

		final ProductionPackage productionPackage = ProductionFactory.eINSTANCE.getProductionPackage();
		productionPackage.getEClassifiers().stream().filter(cfr -> cfr instanceof EClass)
				.forEach(System.out::println);
	}

	public static void printAttributeValues(final EObject eObject) {
		final EClass eClass = eObject.eClass();
		final Iterator<EAttribute> iterator = eClass.getEAllAttributes().iterator();

		while (iterator.hasNext()) {
			final EAttribute attribute = iterator.next();
			if (eObject.eIsSet(attribute)) {
				System.out.println(eObject.eGet(attribute));
			}
		}
	}

	public static void setStructuralFeatureValueReflectively(final EObject eObject, final String featureName) {
		final EStructuralFeature feature = eObject.eClass().getEStructuralFeature(featureName);
		Objects.nonNull(featureName);
		if (feature.getEType() == EcorePackage.Literals.ESTRING) {
			eObject.eSet(feature, "Bamboo");
		}
	}

}
