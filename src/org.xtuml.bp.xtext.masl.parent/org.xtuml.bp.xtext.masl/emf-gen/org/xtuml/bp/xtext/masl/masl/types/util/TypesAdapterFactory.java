/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.types.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtuml.bp.xtext.masl.masl.behavior.AbstractStatement;
import org.xtuml.bp.xtext.masl.masl.behavior.ConstExpression;
import org.xtuml.bp.xtext.masl.masl.behavior.Expression;

import org.xtuml.bp.xtext.masl.masl.structure.AbstractFeature;
import org.xtuml.bp.xtext.masl.masl.structure.AbstractNamed;
import org.xtuml.bp.xtext.masl.masl.structure.Pragmatized;

import org.xtuml.bp.xtext.masl.masl.types.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesSwitch<Adapter> modelSwitch =
		new TypesSwitch<Adapter>() {
			@Override
			public Adapter caseTypeDeclaration(TypeDeclaration object) {
				return createTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseTypeForwardDeclaration(TypeForwardDeclaration object) {
				return createTypeForwardDeclarationAdapter();
			}
			@Override
			public Adapter caseBuiltinTypeDeclaration(BuiltinTypeDeclaration object) {
				return createBuiltinTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseTerminatorTypeReference(TerminatorTypeReference object) {
				return createTerminatorTypeReferenceAdapter();
			}
			@Override
			public Adapter caseAbstractTypeDefinition(AbstractTypeDefinition object) {
				return createAbstractTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseConstrainedTypeDefinition(ConstrainedTypeDefinition object) {
				return createConstrainedTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseAbstractTypeConstraint(AbstractTypeConstraint object) {
				return createAbstractTypeConstraintAdapter();
			}
			@Override
			public Adapter caseRangeConstraint(RangeConstraint object) {
				return createRangeConstraintAdapter();
			}
			@Override
			public Adapter caseDeltaConstraint(DeltaConstraint object) {
				return createDeltaConstraintAdapter();
			}
			@Override
			public Adapter caseDigitsConstraint(DigitsConstraint object) {
				return createDigitsConstraintAdapter();
			}
			@Override
			public Adapter caseStructureTypeDefinition(StructureTypeDefinition object) {
				return createStructureTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseStructureComponentDefinition(StructureComponentDefinition object) {
				return createStructureComponentDefinitionAdapter();
			}
			@Override
			public Adapter caseEnumerationTypeDefinition(EnumerationTypeDefinition object) {
				return createEnumerationTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseEnumerator(Enumerator object) {
				return createEnumeratorAdapter();
			}
			@Override
			public Adapter caseUnconstrainedArrayDefinition(UnconstrainedArrayDefinition object) {
				return createUnconstrainedArrayDefinitionAdapter();
			}
			@Override
			public Adapter caseAbstractTypeReference(AbstractTypeReference object) {
				return createAbstractTypeReferenceAdapter();
			}
			@Override
			public Adapter caseDeprecatedTypeReference(DeprecatedTypeReference object) {
				return createDeprecatedTypeReferenceAdapter();
			}
			@Override
			public Adapter caseInstanceTypeReference(InstanceTypeReference object) {
				return createInstanceTypeReferenceAdapter();
			}
			@Override
			public Adapter caseNamedTypeReference(NamedTypeReference object) {
				return createNamedTypeReferenceAdapter();
			}
			@Override
			public Adapter caseConstrainedArrayTypeReference(ConstrainedArrayTypeReference object) {
				return createConstrainedArrayTypeReferenceAdapter();
			}
			@Override
			public Adapter caseAbstractCollectionTypeReference(AbstractCollectionTypeReference object) {
				return createAbstractCollectionTypeReferenceAdapter();
			}
			@Override
			public Adapter caseSequenceTypeReference(SequenceTypeReference object) {
				return createSequenceTypeReferenceAdapter();
			}
			@Override
			public Adapter caseArrayTypeReference(ArrayTypeReference object) {
				return createArrayTypeReferenceAdapter();
			}
			@Override
			public Adapter caseSetTypeReference(SetTypeReference object) {
				return createSetTypeReferenceAdapter();
			}
			@Override
			public Adapter caseBagTypeReference(BagTypeReference object) {
				return createBagTypeReferenceAdapter();
			}
			@Override
			public Adapter caseDictionaryTypeReference(DictionaryTypeReference object) {
				return createDictionaryTypeReferenceAdapter();
			}
			@Override
			public Adapter casePragmatized(Pragmatized object) {
				return createPragmatizedAdapter();
			}
			@Override
			public Adapter caseAbstractNamed(AbstractNamed object) {
				return createAbstractNamedAdapter();
			}
			@Override
			public Adapter caseAbstractFeature(AbstractFeature object) {
				return createAbstractFeatureAdapter();
			}
			@Override
			public Adapter caseAbstractStatement(AbstractStatement object) {
				return createAbstractStatementAdapter();
			}
			@Override
			public Adapter caseConstExpression(ConstExpression object) {
				return createConstExpressionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypeDeclaration
	 * @generated
	 */
	public Adapter createTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.TypeForwardDeclaration <em>Type Forward Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypeForwardDeclaration
	 * @generated
	 */
	public Adapter createTypeForwardDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.BuiltinTypeDeclaration <em>Builtin Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.BuiltinTypeDeclaration
	 * @generated
	 */
	public Adapter createBuiltinTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.TerminatorTypeReference <em>Terminator Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.TerminatorTypeReference
	 * @generated
	 */
	public Adapter createTerminatorTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.AbstractTypeDefinition <em>Abstract Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.AbstractTypeDefinition
	 * @generated
	 */
	public Adapter createAbstractTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.ConstrainedTypeDefinition <em>Constrained Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.ConstrainedTypeDefinition
	 * @generated
	 */
	public Adapter createConstrainedTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.AbstractTypeConstraint <em>Abstract Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.AbstractTypeConstraint
	 * @generated
	 */
	public Adapter createAbstractTypeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.RangeConstraint <em>Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.RangeConstraint
	 * @generated
	 */
	public Adapter createRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.DeltaConstraint <em>Delta Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.DeltaConstraint
	 * @generated
	 */
	public Adapter createDeltaConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.DigitsConstraint <em>Digits Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.DigitsConstraint
	 * @generated
	 */
	public Adapter createDigitsConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.StructureTypeDefinition <em>Structure Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.StructureTypeDefinition
	 * @generated
	 */
	public Adapter createStructureTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.StructureComponentDefinition <em>Structure Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.StructureComponentDefinition
	 * @generated
	 */
	public Adapter createStructureComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.EnumerationTypeDefinition <em>Enumeration Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.EnumerationTypeDefinition
	 * @generated
	 */
	public Adapter createEnumerationTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.Enumerator <em>Enumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.Enumerator
	 * @generated
	 */
	public Adapter createEnumeratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.UnconstrainedArrayDefinition <em>Unconstrained Array Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.UnconstrainedArrayDefinition
	 * @generated
	 */
	public Adapter createUnconstrainedArrayDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.AbstractTypeReference <em>Abstract Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.AbstractTypeReference
	 * @generated
	 */
	public Adapter createAbstractTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.DeprecatedTypeReference <em>Deprecated Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.DeprecatedTypeReference
	 * @generated
	 */
	public Adapter createDeprecatedTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.InstanceTypeReference <em>Instance Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.InstanceTypeReference
	 * @generated
	 */
	public Adapter createInstanceTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.NamedTypeReference <em>Named Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.NamedTypeReference
	 * @generated
	 */
	public Adapter createNamedTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.ConstrainedArrayTypeReference <em>Constrained Array Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.ConstrainedArrayTypeReference
	 * @generated
	 */
	public Adapter createConstrainedArrayTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.AbstractCollectionTypeReference <em>Abstract Collection Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.AbstractCollectionTypeReference
	 * @generated
	 */
	public Adapter createAbstractCollectionTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.SequenceTypeReference <em>Sequence Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.SequenceTypeReference
	 * @generated
	 */
	public Adapter createSequenceTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.ArrayTypeReference <em>Array Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.ArrayTypeReference
	 * @generated
	 */
	public Adapter createArrayTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.SetTypeReference <em>Set Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.SetTypeReference
	 * @generated
	 */
	public Adapter createSetTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.BagTypeReference <em>Bag Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.BagTypeReference
	 * @generated
	 */
	public Adapter createBagTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.types.DictionaryTypeReference <em>Dictionary Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.types.DictionaryTypeReference
	 * @generated
	 */
	public Adapter createDictionaryTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.Pragmatized <em>Pragmatized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Pragmatized
	 * @generated
	 */
	public Adapter createPragmatizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractNamed <em>Abstract Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.AbstractNamed
	 * @generated
	 */
	public Adapter createAbstractNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.structure.AbstractFeature <em>Abstract Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.AbstractFeature
	 * @generated
	 */
	public Adapter createAbstractFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.behavior.AbstractStatement <em>Abstract Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.AbstractStatement
	 * @generated
	 */
	public Adapter createAbstractStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.behavior.ConstExpression <em>Const Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.ConstExpression
	 * @generated
	 */
	public Adapter createConstExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xtuml.bp.xtext.masl.masl.behavior.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TypesAdapterFactory