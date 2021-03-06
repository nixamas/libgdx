/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class Face extends Feature {
	private long swigCPtr;
	
	protected Face(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, gdxBulletJNI.Face_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected Face(long cPtr, boolean cMemoryOwn) {
		this("Face", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(gdxBulletJNI.Face_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(Face obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_Face(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setN(SWIGTYPE_p_p_Node value) {
    gdxBulletJNI.Face_n_set(swigCPtr, this, SWIGTYPE_p_p_Node.getCPtr(value));
  }

  public SWIGTYPE_p_p_Node getN() {
    long cPtr = gdxBulletJNI.Face_n_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_Node(cPtr, false);
  }

  public void setNormal(btVector3 value) {
    gdxBulletJNI.Face_normal_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getNormal() {
    long cPtr = gdxBulletJNI.Face_normal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setRa(float value) {
    gdxBulletJNI.Face_ra_set(swigCPtr, this, value);
  }

  public float getRa() {
    return gdxBulletJNI.Face_ra_get(swigCPtr, this);
  }

  public void setLeaf(btDbvtNode value) {
    gdxBulletJNI.Face_leaf_set(swigCPtr, this, btDbvtNode.getCPtr(value), value);
  }

  public btDbvtNode getLeaf() {
    long cPtr = gdxBulletJNI.Face_leaf_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btDbvtNode(cPtr, false);
  }

  public Face() {
    this(gdxBulletJNI.new_Face(), true);
  }

}
