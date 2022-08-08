package io.yupiik.kubernetes.bindings.v1_19_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_12.Validable;
import io.yupiik.kubernetes.bindings.v1_19_12.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeSpec implements Validable<PersistentVolumeSpec> {
    private List<String> accessModes;
    private AWSElasticBlockStoreVolumeSource awsElasticBlockStore;
    private AzureDiskVolumeSource azureDisk;
    private AzureFilePersistentVolumeSource azureFile;
    private JsonObject capacity;
    private CephFSPersistentVolumeSource cephfs;
    private CinderPersistentVolumeSource cinder;
    private ObjectReference claimRef;
    private CSIPersistentVolumeSource csi;
    private FCVolumeSource fc;
    private FlexPersistentVolumeSource flexVolume;
    private FlockerVolumeSource flocker;
    private GCEPersistentDiskVolumeSource gcePersistentDisk;
    private GlusterfsPersistentVolumeSource glusterfs;
    private HostPathVolumeSource hostPath;
    private ISCSIPersistentVolumeSource iscsi;
    private LocalVolumeSource local;
    private List<String> mountOptions;
    private NFSVolumeSource nfs;
    private VolumeNodeAffinity nodeAffinity;
    private String persistentVolumeReclaimPolicy;
    private PhotonPersistentDiskVolumeSource photonPersistentDisk;
    private PortworxVolumeSource portworxVolume;
    private QuobyteVolumeSource quobyte;
    private RBDPersistentVolumeSource rbd;
    private ScaleIOPersistentVolumeSource scaleIO;
    private String storageClassName;
    private StorageOSPersistentVolumeSource storageos;
    private String volumeMode;
    private VsphereVirtualDiskVolumeSource vsphereVolume;

    public PersistentVolumeSpec() {
        // no-op
    }

    public PersistentVolumeSpec(final List<String> accessModes,
                                final AWSElasticBlockStoreVolumeSource awsElasticBlockStore,
                                final AzureDiskVolumeSource azureDisk,
                                final AzureFilePersistentVolumeSource azureFile,
                                final JsonObject capacity,
                                final CephFSPersistentVolumeSource cephfs,
                                final CinderPersistentVolumeSource cinder,
                                final ObjectReference claimRef,
                                final CSIPersistentVolumeSource csi,
                                final FCVolumeSource fc,
                                final FlexPersistentVolumeSource flexVolume,
                                final FlockerVolumeSource flocker,
                                final GCEPersistentDiskVolumeSource gcePersistentDisk,
                                final GlusterfsPersistentVolumeSource glusterfs,
                                final HostPathVolumeSource hostPath,
                                final ISCSIPersistentVolumeSource iscsi,
                                final LocalVolumeSource local,
                                final List<String> mountOptions,
                                final NFSVolumeSource nfs,
                                final VolumeNodeAffinity nodeAffinity,
                                final String persistentVolumeReclaimPolicy,
                                final PhotonPersistentDiskVolumeSource photonPersistentDisk,
                                final PortworxVolumeSource portworxVolume,
                                final QuobyteVolumeSource quobyte,
                                final RBDPersistentVolumeSource rbd,
                                final ScaleIOPersistentVolumeSource scaleIO,
                                final String storageClassName,
                                final StorageOSPersistentVolumeSource storageos,
                                final String volumeMode,
                                final VsphereVirtualDiskVolumeSource vsphereVolume) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public AzureDiskVolumeSource getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final AzureDiskVolumeSource azureDisk) {
        this.azureDisk = azureDisk;
    }

    public AzureFilePersistentVolumeSource getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final AzureFilePersistentVolumeSource azureFile) {
        this.azureFile = azureFile;
    }

    public JsonObject getCapacity() {
        return capacity;
    }

    public void setCapacity(final JsonObject capacity) {
        this.capacity = capacity;
    }

    public CephFSPersistentVolumeSource getCephfs() {
        return cephfs;
    }

    public void setCephfs(final CephFSPersistentVolumeSource cephfs) {
        this.cephfs = cephfs;
    }

    public CinderPersistentVolumeSource getCinder() {
        return cinder;
    }

    public void setCinder(final CinderPersistentVolumeSource cinder) {
        this.cinder = cinder;
    }

    public ObjectReference getClaimRef() {
        return claimRef;
    }

    public void setClaimRef(final ObjectReference claimRef) {
        this.claimRef = claimRef;
    }

    public CSIPersistentVolumeSource getCsi() {
        return csi;
    }

    public void setCsi(final CSIPersistentVolumeSource csi) {
        this.csi = csi;
    }

    public FCVolumeSource getFc() {
        return fc;
    }

    public void setFc(final FCVolumeSource fc) {
        this.fc = fc;
    }

    public FlexPersistentVolumeSource getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final FlexPersistentVolumeSource flexVolume) {
        this.flexVolume = flexVolume;
    }

    public FlockerVolumeSource getFlocker() {
        return flocker;
    }

    public void setFlocker(final FlockerVolumeSource flocker) {
        this.flocker = flocker;
    }

    public GCEPersistentDiskVolumeSource getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final GCEPersistentDiskVolumeSource gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public GlusterfsPersistentVolumeSource getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final GlusterfsPersistentVolumeSource glusterfs) {
        this.glusterfs = glusterfs;
    }

    public HostPathVolumeSource getHostPath() {
        return hostPath;
    }

    public void setHostPath(final HostPathVolumeSource hostPath) {
        this.hostPath = hostPath;
    }

    public ISCSIPersistentVolumeSource getIscsi() {
        return iscsi;
    }

    public void setIscsi(final ISCSIPersistentVolumeSource iscsi) {
        this.iscsi = iscsi;
    }

    public LocalVolumeSource getLocal() {
        return local;
    }

    public void setLocal(final LocalVolumeSource local) {
        this.local = local;
    }

    public List<String> getMountOptions() {
        return mountOptions;
    }

    public void setMountOptions(final List<String> mountOptions) {
        this.mountOptions = mountOptions;
    }

    public NFSVolumeSource getNfs() {
        return nfs;
    }

    public void setNfs(final NFSVolumeSource nfs) {
        this.nfs = nfs;
    }

    public VolumeNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final VolumeNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public String getPersistentVolumeReclaimPolicy() {
        return persistentVolumeReclaimPolicy;
    }

    public void setPersistentVolumeReclaimPolicy(final String persistentVolumeReclaimPolicy) {
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    }

    public PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final PhotonPersistentDiskVolumeSource photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public PortworxVolumeSource getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final PortworxVolumeSource portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public QuobyteVolumeSource getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final QuobyteVolumeSource quobyte) {
        this.quobyte = quobyte;
    }

    public RBDPersistentVolumeSource getRbd() {
        return rbd;
    }

    public void setRbd(final RBDPersistentVolumeSource rbd) {
        this.rbd = rbd;
    }

    public ScaleIOPersistentVolumeSource getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final ScaleIOPersistentVolumeSource scaleIO) {
        this.scaleIO = scaleIO;
    }

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
    }

    public StorageOSPersistentVolumeSource getStorageos() {
        return storageos;
    }

    public void setStorageos(final StorageOSPersistentVolumeSource storageos) {
        this.storageos = storageos;
    }

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(final String volumeMode) {
        this.volumeMode = volumeMode;
    }

    public VsphereVirtualDiskVolumeSource getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final VsphereVirtualDiskVolumeSource vsphereVolume) {
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

    public PersistentVolumeSpec accessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeSpec awsElasticBlockStore(final AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
        return this;
    }

    public PersistentVolumeSpec azureDisk(final AzureDiskVolumeSource azureDisk) {
        this.azureDisk = azureDisk;
        return this;
    }

    public PersistentVolumeSpec azureFile(final AzureFilePersistentVolumeSource azureFile) {
        this.azureFile = azureFile;
        return this;
    }

    public PersistentVolumeSpec capacity(final JsonObject capacity) {
        this.capacity = capacity;
        return this;
    }

    public PersistentVolumeSpec cephfs(final CephFSPersistentVolumeSource cephfs) {
        this.cephfs = cephfs;
        return this;
    }

    public PersistentVolumeSpec cinder(final CinderPersistentVolumeSource cinder) {
        this.cinder = cinder;
        return this;
    }

    public PersistentVolumeSpec claimRef(final ObjectReference claimRef) {
        this.claimRef = claimRef;
        return this;
    }

    public PersistentVolumeSpec csi(final CSIPersistentVolumeSource csi) {
        this.csi = csi;
        return this;
    }

    public PersistentVolumeSpec fc(final FCVolumeSource fc) {
        this.fc = fc;
        return this;
    }

    public PersistentVolumeSpec flexVolume(final FlexPersistentVolumeSource flexVolume) {
        this.flexVolume = flexVolume;
        return this;
    }

    public PersistentVolumeSpec flocker(final FlockerVolumeSource flocker) {
        this.flocker = flocker;
        return this;
    }

    public PersistentVolumeSpec gcePersistentDisk(final GCEPersistentDiskVolumeSource gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
        return this;
    }

    public PersistentVolumeSpec glusterfs(final GlusterfsPersistentVolumeSource glusterfs) {
        this.glusterfs = glusterfs;
        return this;
    }

    public PersistentVolumeSpec hostPath(final HostPathVolumeSource hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    public PersistentVolumeSpec iscsi(final ISCSIPersistentVolumeSource iscsi) {
        this.iscsi = iscsi;
        return this;
    }

    public PersistentVolumeSpec local(final LocalVolumeSource local) {
        this.local = local;
        return this;
    }

    public PersistentVolumeSpec mountOptions(final List<String> mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

    public PersistentVolumeSpec nfs(final NFSVolumeSource nfs) {
        this.nfs = nfs;
        return this;
    }

    public PersistentVolumeSpec nodeAffinity(final VolumeNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }

    public PersistentVolumeSpec persistentVolumeReclaimPolicy(final String persistentVolumeReclaimPolicy) {
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
        return this;
    }

    public PersistentVolumeSpec photonPersistentDisk(final PhotonPersistentDiskVolumeSource photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
        return this;
    }

    public PersistentVolumeSpec portworxVolume(final PortworxVolumeSource portworxVolume) {
        this.portworxVolume = portworxVolume;
        return this;
    }

    public PersistentVolumeSpec quobyte(final QuobyteVolumeSource quobyte) {
        this.quobyte = quobyte;
        return this;
    }

    public PersistentVolumeSpec rbd(final RBDPersistentVolumeSource rbd) {
        this.rbd = rbd;
        return this;
    }

    public PersistentVolumeSpec scaleIO(final ScaleIOPersistentVolumeSource scaleIO) {
        this.scaleIO = scaleIO;
        return this;
    }

    public PersistentVolumeSpec storageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
        return this;
    }

    public PersistentVolumeSpec storageos(final StorageOSPersistentVolumeSource storageos) {
        this.storageos = storageos;
        return this;
    }

    public PersistentVolumeSpec volumeMode(final String volumeMode) {
        this.volumeMode = volumeMode;
        return this;
    }

    public PersistentVolumeSpec vsphereVolume(final VsphereVirtualDiskVolumeSource vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
        return this;
    }

    @Override
    public PersistentVolumeSpec validate() {
        return this;
    }
}
