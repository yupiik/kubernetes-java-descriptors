package io.yupiik.kubernetes.bindings.v1_10_12;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PersistentVolumeSpec {
    private List<String> accessModes;
    private PersistentVolumeSpecAwsElasticBlockStore awsElasticBlockStore;
    private PersistentVolumeSpecAzureDisk azureDisk;
    private PersistentVolumeSpecAzureFile azureFile;
    private Map<String, String> capacity;
    private PersistentVolumeSpecCephfs cephfs;
    private PersistentVolumeSpecCinder cinder;
    private PersistentVolumeSpecClaimRef claimRef;
    private PersistentVolumeSpecCsi csi;
    private PersistentVolumeSpecFc fc;
    private PersistentVolumeSpecFlexVolume flexVolume;
    private PersistentVolumeSpecFlocker flocker;
    private PersistentVolumeSpecGcePersistentDisk gcePersistentDisk;
    private PersistentVolumeSpecGlusterfs glusterfs;
    private PersistentVolumeSpecHostPath hostPath;
    private PersistentVolumeSpecIscsi iscsi;
    private PersistentVolumeSpecLocal local;
    private List<String> mountOptions;
    private PersistentVolumeSpecNfs nfs;
    private PersistentVolumeSpecNodeAffinity nodeAffinity;
    private String persistentVolumeReclaimPolicy;
    private PersistentVolumeSpecPhotonPersistentDisk photonPersistentDisk;
    private PersistentVolumeSpecPortworxVolume portworxVolume;
    private PersistentVolumeSpecQuobyte quobyte;
    private PersistentVolumeSpecRbd rbd;
    private PersistentVolumeSpecScaleIO scaleIO;
    private String storageClassName;
    private PersistentVolumeSpecStorageos storageos;
    private String volumeMode;
    private PersistentVolumeSpecVsphereVolume vsphereVolume;

    public PersistentVolumeSpec() {
        // no-op
    }

    public PersistentVolumeSpec(final List<String> accessModes,
                                final PersistentVolumeSpecAwsElasticBlockStore awsElasticBlockStore,
                                final PersistentVolumeSpecAzureDisk azureDisk,
                                final PersistentVolumeSpecAzureFile azureFile,
                                final Map<String, String> capacity,
                                final PersistentVolumeSpecCephfs cephfs,
                                final PersistentVolumeSpecCinder cinder,
                                final PersistentVolumeSpecClaimRef claimRef,
                                final PersistentVolumeSpecCsi csi,
                                final PersistentVolumeSpecFc fc,
                                final PersistentVolumeSpecFlexVolume flexVolume,
                                final PersistentVolumeSpecFlocker flocker,
                                final PersistentVolumeSpecGcePersistentDisk gcePersistentDisk,
                                final PersistentVolumeSpecGlusterfs glusterfs,
                                final PersistentVolumeSpecHostPath hostPath,
                                final PersistentVolumeSpecIscsi iscsi,
                                final PersistentVolumeSpecLocal local,
                                final List<String> mountOptions,
                                final PersistentVolumeSpecNfs nfs,
                                final PersistentVolumeSpecNodeAffinity nodeAffinity,
                                final String persistentVolumeReclaimPolicy,
                                final PersistentVolumeSpecPhotonPersistentDisk photonPersistentDisk,
                                final PersistentVolumeSpecPortworxVolume portworxVolume,
                                final PersistentVolumeSpecQuobyte quobyte,
                                final PersistentVolumeSpecRbd rbd,
                                final PersistentVolumeSpecScaleIO scaleIO,
                                final String storageClassName,
                                final PersistentVolumeSpecStorageos storageos,
                                final String volumeMode,
                                final PersistentVolumeSpecVsphereVolume vsphereVolume) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public PersistentVolumeSpecAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final PersistentVolumeSpecAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public PersistentVolumeSpecAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final PersistentVolumeSpecAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public PersistentVolumeSpecAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final PersistentVolumeSpecAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public Map<String, String> getCapacity() {
        return capacity;
    }

    public void setCapacity(final Map<String, String> capacity) {
        this.capacity = capacity;
    }

    public PersistentVolumeSpecCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final PersistentVolumeSpecCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public PersistentVolumeSpecCinder getCinder() {
        return cinder;
    }

    public void setCinder(final PersistentVolumeSpecCinder cinder) {
        this.cinder = cinder;
    }

    public PersistentVolumeSpecClaimRef getClaimRef() {
        return claimRef;
    }

    public void setClaimRef(final PersistentVolumeSpecClaimRef claimRef) {
        this.claimRef = claimRef;
    }

    public PersistentVolumeSpecCsi getCsi() {
        return csi;
    }

    public void setCsi(final PersistentVolumeSpecCsi csi) {
        this.csi = csi;
    }

    public PersistentVolumeSpecFc getFc() {
        return fc;
    }

    public void setFc(final PersistentVolumeSpecFc fc) {
        this.fc = fc;
    }

    public PersistentVolumeSpecFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final PersistentVolumeSpecFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public PersistentVolumeSpecFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final PersistentVolumeSpecFlocker flocker) {
        this.flocker = flocker;
    }

    public PersistentVolumeSpecGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final PersistentVolumeSpecGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public PersistentVolumeSpecGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final PersistentVolumeSpecGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public PersistentVolumeSpecHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final PersistentVolumeSpecHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public PersistentVolumeSpecIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final PersistentVolumeSpecIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public PersistentVolumeSpecLocal getLocal() {
        return local;
    }

    public void setLocal(final PersistentVolumeSpecLocal local) {
        this.local = local;
    }

    public List<String> getMountOptions() {
        return mountOptions;
    }

    public void setMountOptions(final List<String> mountOptions) {
        this.mountOptions = mountOptions;
    }

    public PersistentVolumeSpecNfs getNfs() {
        return nfs;
    }

    public void setNfs(final PersistentVolumeSpecNfs nfs) {
        this.nfs = nfs;
    }

    public PersistentVolumeSpecNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final PersistentVolumeSpecNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public String getPersistentVolumeReclaimPolicy() {
        return persistentVolumeReclaimPolicy;
    }

    public void setPersistentVolumeReclaimPolicy(final String persistentVolumeReclaimPolicy) {
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    }

    public PersistentVolumeSpecPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final PersistentVolumeSpecPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public PersistentVolumeSpecPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final PersistentVolumeSpecPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public PersistentVolumeSpecQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final PersistentVolumeSpecQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public PersistentVolumeSpecRbd getRbd() {
        return rbd;
    }

    public void setRbd(final PersistentVolumeSpecRbd rbd) {
        this.rbd = rbd;
    }

    public PersistentVolumeSpecScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final PersistentVolumeSpecScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
    }

    public PersistentVolumeSpecStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final PersistentVolumeSpecStorageos storageos) {
        this.storageos = storageos;
    }

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(final String volumeMode) {
        this.volumeMode = volumeMode;
    }

    public PersistentVolumeSpecVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final PersistentVolumeSpecVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accessModes,
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                capacity,
                cephfs,
                cinder,
                claimRef,
                csi,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                glusterfs,
                hostPath,
                iscsi,
                local,
                mountOptions,
                nfs,
                nodeAffinity,
                persistentVolumeReclaimPolicy,
                photonPersistentDisk,
                portworxVolume,
                quobyte,
                rbd,
                scaleIO,
                storageClassName,
                storageos,
                volumeMode,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeSpec)) {
            return false;
        }
        final PersistentVolumeSpec __otherCasted = (PersistentVolumeSpec) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(claimRef, __otherCasted.claimRef) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(local, __otherCasted.local) &&
            Objects.equals(mountOptions, __otherCasted.mountOptions) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(persistentVolumeReclaimPolicy, __otherCasted.persistentVolumeReclaimPolicy) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(volumeMode, __otherCasted.volumeMode) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
