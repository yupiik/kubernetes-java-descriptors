package io.yupiik.kubernetes.bindings.v1_18_18;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PersistentVolumeListItemsSpec {
    private List<String> accessModes;
    private PersistentVolumeListItemsSpecAwsElasticBlockStore awsElasticBlockStore;
    private PersistentVolumeListItemsSpecAzureDisk azureDisk;
    private PersistentVolumeListItemsSpecAzureFile azureFile;
    private Map<String, String> capacity;
    private PersistentVolumeListItemsSpecCephfs cephfs;
    private PersistentVolumeListItemsSpecCinder cinder;
    private PersistentVolumeListItemsSpecClaimRef claimRef;
    private PersistentVolumeListItemsSpecCsi csi;
    private PersistentVolumeListItemsSpecFc fc;
    private PersistentVolumeListItemsSpecFlexVolume flexVolume;
    private PersistentVolumeListItemsSpecFlocker flocker;
    private PersistentVolumeListItemsSpecGcePersistentDisk gcePersistentDisk;
    private PersistentVolumeListItemsSpecGlusterfs glusterfs;
    private PersistentVolumeListItemsSpecHostPath hostPath;
    private PersistentVolumeListItemsSpecIscsi iscsi;
    private PersistentVolumeListItemsSpecLocal local;
    private List<String> mountOptions;
    private PersistentVolumeListItemsSpecNfs nfs;
    private PersistentVolumeListItemsSpecNodeAffinity nodeAffinity;
    private String persistentVolumeReclaimPolicy;
    private PersistentVolumeListItemsSpecPhotonPersistentDisk photonPersistentDisk;
    private PersistentVolumeListItemsSpecPortworxVolume portworxVolume;
    private PersistentVolumeListItemsSpecQuobyte quobyte;
    private PersistentVolumeListItemsSpecRbd rbd;
    private PersistentVolumeListItemsSpecScaleIO scaleIO;
    private String storageClassName;
    private PersistentVolumeListItemsSpecStorageos storageos;
    private String volumeMode;
    private PersistentVolumeListItemsSpecVsphereVolume vsphereVolume;

    public PersistentVolumeListItemsSpec() {
        // no-op
    }

    public PersistentVolumeListItemsSpec(final List<String> accessModes,
                                         final PersistentVolumeListItemsSpecAwsElasticBlockStore awsElasticBlockStore,
                                         final PersistentVolumeListItemsSpecAzureDisk azureDisk,
                                         final PersistentVolumeListItemsSpecAzureFile azureFile,
                                         final Map<String, String> capacity,
                                         final PersistentVolumeListItemsSpecCephfs cephfs,
                                         final PersistentVolumeListItemsSpecCinder cinder,
                                         final PersistentVolumeListItemsSpecClaimRef claimRef,
                                         final PersistentVolumeListItemsSpecCsi csi,
                                         final PersistentVolumeListItemsSpecFc fc,
                                         final PersistentVolumeListItemsSpecFlexVolume flexVolume,
                                         final PersistentVolumeListItemsSpecFlocker flocker,
                                         final PersistentVolumeListItemsSpecGcePersistentDisk gcePersistentDisk,
                                         final PersistentVolumeListItemsSpecGlusterfs glusterfs,
                                         final PersistentVolumeListItemsSpecHostPath hostPath,
                                         final PersistentVolumeListItemsSpecIscsi iscsi,
                                         final PersistentVolumeListItemsSpecLocal local,
                                         final List<String> mountOptions,
                                         final PersistentVolumeListItemsSpecNfs nfs,
                                         final PersistentVolumeListItemsSpecNodeAffinity nodeAffinity,
                                         final String persistentVolumeReclaimPolicy,
                                         final PersistentVolumeListItemsSpecPhotonPersistentDisk photonPersistentDisk,
                                         final PersistentVolumeListItemsSpecPortworxVolume portworxVolume,
                                         final PersistentVolumeListItemsSpecQuobyte quobyte,
                                         final PersistentVolumeListItemsSpecRbd rbd,
                                         final PersistentVolumeListItemsSpecScaleIO scaleIO,
                                         final String storageClassName,
                                         final PersistentVolumeListItemsSpecStorageos storageos,
                                         final String volumeMode,
                                         final PersistentVolumeListItemsSpecVsphereVolume vsphereVolume) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public PersistentVolumeListItemsSpecAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final PersistentVolumeListItemsSpecAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public PersistentVolumeListItemsSpecAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final PersistentVolumeListItemsSpecAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public PersistentVolumeListItemsSpecAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final PersistentVolumeListItemsSpecAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public Map<String, String> getCapacity() {
        return capacity;
    }

    public void setCapacity(final Map<String, String> capacity) {
        this.capacity = capacity;
    }

    public PersistentVolumeListItemsSpecCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final PersistentVolumeListItemsSpecCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public PersistentVolumeListItemsSpecCinder getCinder() {
        return cinder;
    }

    public void setCinder(final PersistentVolumeListItemsSpecCinder cinder) {
        this.cinder = cinder;
    }

    public PersistentVolumeListItemsSpecClaimRef getClaimRef() {
        return claimRef;
    }

    public void setClaimRef(final PersistentVolumeListItemsSpecClaimRef claimRef) {
        this.claimRef = claimRef;
    }

    public PersistentVolumeListItemsSpecCsi getCsi() {
        return csi;
    }

    public void setCsi(final PersistentVolumeListItemsSpecCsi csi) {
        this.csi = csi;
    }

    public PersistentVolumeListItemsSpecFc getFc() {
        return fc;
    }

    public void setFc(final PersistentVolumeListItemsSpecFc fc) {
        this.fc = fc;
    }

    public PersistentVolumeListItemsSpecFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final PersistentVolumeListItemsSpecFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public PersistentVolumeListItemsSpecFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final PersistentVolumeListItemsSpecFlocker flocker) {
        this.flocker = flocker;
    }

    public PersistentVolumeListItemsSpecGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final PersistentVolumeListItemsSpecGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public PersistentVolumeListItemsSpecGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final PersistentVolumeListItemsSpecGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public PersistentVolumeListItemsSpecHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final PersistentVolumeListItemsSpecHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public PersistentVolumeListItemsSpecIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final PersistentVolumeListItemsSpecIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public PersistentVolumeListItemsSpecLocal getLocal() {
        return local;
    }

    public void setLocal(final PersistentVolumeListItemsSpecLocal local) {
        this.local = local;
    }

    public List<String> getMountOptions() {
        return mountOptions;
    }

    public void setMountOptions(final List<String> mountOptions) {
        this.mountOptions = mountOptions;
    }

    public PersistentVolumeListItemsSpecNfs getNfs() {
        return nfs;
    }

    public void setNfs(final PersistentVolumeListItemsSpecNfs nfs) {
        this.nfs = nfs;
    }

    public PersistentVolumeListItemsSpecNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final PersistentVolumeListItemsSpecNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public String getPersistentVolumeReclaimPolicy() {
        return persistentVolumeReclaimPolicy;
    }

    public void setPersistentVolumeReclaimPolicy(final String persistentVolumeReclaimPolicy) {
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    }

    public PersistentVolumeListItemsSpecPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final PersistentVolumeListItemsSpecPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public PersistentVolumeListItemsSpecPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final PersistentVolumeListItemsSpecPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public PersistentVolumeListItemsSpecQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final PersistentVolumeListItemsSpecQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public PersistentVolumeListItemsSpecRbd getRbd() {
        return rbd;
    }

    public void setRbd(final PersistentVolumeListItemsSpecRbd rbd) {
        this.rbd = rbd;
    }

    public PersistentVolumeListItemsSpecScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final PersistentVolumeListItemsSpecScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
    }

    public PersistentVolumeListItemsSpecStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final PersistentVolumeListItemsSpecStorageos storageos) {
        this.storageos = storageos;
    }

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(final String volumeMode) {
        this.volumeMode = volumeMode;
    }

    public PersistentVolumeListItemsSpecVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final PersistentVolumeListItemsSpecVsphereVolume vsphereVolume) {
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
        if (!(__other instanceof PersistentVolumeListItemsSpec)) {
            return false;
        }
        final PersistentVolumeListItemsSpec __otherCasted = (PersistentVolumeListItemsSpec) __other;
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
