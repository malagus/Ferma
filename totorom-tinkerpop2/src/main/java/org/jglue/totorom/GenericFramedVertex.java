package org.jglue.totorom;

import java.util.Set;

/**
 * A framed vertex for use when you don't want to create a new frame class. Typically used in traversals.
 * @author bryn
 *
 */
public final class GenericFramedVertex extends FramedVertex {

	@Override
	public FramedVertexTraversal<?, ?, ?> both(int branchFactor, String... labels) {

		return super.both(branchFactor, labels);
	}

	@Override
	public FramedVertexTraversal<?, ?, ?> both(String... labels) {

		return super.both(labels);
	}

	@Override
	public FramedEdgeTraversal<?, ?, ?> bothE(int branchFactor, String... labels) {

		return super.bothE(branchFactor, labels);
	}

	@Override
	public FramedEdgeTraversal<?, ?, ?> bothE(String... labels) {

		return super.bothE(labels);
	}

	@Override
	public FramedEdgeTraversal<?, ?, ?> E() {

		return super.E();
	}

	@Override
	public FramedEdgeTraversal<?, ?, ?> e(Object... ids) {

		return super.e(ids);
	}

	@Override
	public <N> N getId() {

		return super.getId();
	}
	
	
	
	@Override
	public <N> N getId(Class<N> clazz) {

		return (N) super.getId(clazz);
	}

	@Override
	public <T> T getProperty(String name) {

		return super.getProperty(name);
	}
	
	@Override
	public <T> T getProperty(String name, Class<T> clazz) {
		return super.getProperty(name, clazz);
	}

	@Override
	public Set<String> getPropertyKeys() {

		return super.getPropertyKeys();
	}

	@Override
	public FramedVertexTraversal<?, ?, ?> in(int branchFactor, String... labels) {

		return super.in(branchFactor, labels);
	}

	@Override
	public FramedVertexTraversal<?, ?, ?> in(String... labels) {

		return super.in(labels);
	}

	@Override
	public FramedEdgeTraversal<?, ?, ?> inE(int branchFactor, String... labels) {

		return super.inE(branchFactor, labels);
	}

	@Override
	public FramedEdgeTraversal<?, ?, ?> inE(String... labels) {

		return super.inE(labels);
	}

	@Override
	public FramedVertexTraversal<?, ?, ?> out(int branchFactor, String... labels) {

		return super.out(branchFactor, labels);
	}

	@Override
	public FramedVertexTraversal<?, ?, ?> out(String... labels) {

		return super.out(labels);
	}

	@Override
	public FramedEdgeTraversal<?, ?, ?> outE(int branchFactor, String... labels) {

		return super.outE(branchFactor, labels);
	}

	@Override
	public FramedEdgeTraversal<?, ?, ?> outE(String... labels) {

		return super.outE(labels);
	}

}
