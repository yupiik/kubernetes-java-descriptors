package io.yupiik.kubernetes.bindings.v1_9_4.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_9_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_9_4.Validable;
import io.yupiik.kubernetes.bindings.v1_9_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Volume implements Validable<Volume>, Exportable {
    private AWSElasticBlockStoreVolumeSource awsElasticBlockStore;
    private AzureDiskVolumeSource azureDisk;
    private AzureFileVolumeSource azureFile;
    private CephFSVolumeSource cephfs;
    private CinderVolumeSource cinder;
    private ConfigMapVolumeSource configMap;
    private DownwardAPIVolumeSource downwardAPI;
    private EmptyDirVolumeSource emptyDir;
    private FCVolumeSource fc;
    private FlexVolumeSource flexVolume;
    private FlockerVolumeSource flocker;
    private GCEPersistentDiskVolumeSource gcePersistentDisk;
    private GitRepoVolumeSource gitRepo;
    private GlusterfsVolumeSource glusterfs;
    private HostPathVolumeSource hostPath;
    private ISCSIVolumeSource iscsi;
    private String name;
    private NFSVolumeSource nfs;
    private PersistentVolumeClaimVolumeSource persistentVolumeClaim;
    private PhotonPersistentDiskVolumeSource photonPersistentDisk;
    private PortworxVolumeSource portworxVolume;
    private ProjectedVolumeSource projected;
    private QuobyteVolumeSource quobyte;
    private RBDVolumeSource rbd;
    private ScaleIOVolumeSource scaleIO;
    private SecretVolumeSource secret;
    private StorageOSVolumeSource storageos;
    private VsphereVirtualDiskVolumeSource vsphereVolume;

    public Volume() {
        // no-op
    }

    public Volume(final AWSElasticBlockStoreVolumeSource awsElasticBlockStore,
                  final AzureDiskVolumeSource azureDisk,
                  final AzureFileVolumeSource azureFile,
                  final CephFSVolumeSource cephfs,
                  final CinderVolumeSource cinder,
                  final ConfigMapVolumeSource configMap,
                  final DownwardAPIVolumeSource downwardAPI,
                  final EmptyDirVolumeSource emptyDir,
                  final FCVolumeSource fc,
                  final FlexVolumeSource flexVolume,
                  final FlockerVolumeSource flocker,
                  final GCEPersistentDiskVolumeSource gcePersistentDisk,
                  final GitRepoVolumeSource gitRepo,
                  final GlusterfsVolumeSource glusterfs,
                  final HostPathVolumeSource hostPath,
                  final ISCSIVolumeSource iscsi,
                  final String name,
                  final NFSVolumeSource nfs,
                  final PersistentVolumeClaimVolumeSource persistentVolumeClaim,
                  final PhotonPersistentDiskVolumeSource photonPersistentDisk,
                  final PortworxVolumeSource portworxVolume,
                  final ProjectedVolumeSource projected,
                  final QuobyteVolumeSource quobyte,
                  final RBDVolumeSource rbd,
                  final ScaleIOVolumeSource scaleIO,
                  final SecretVolumeSource secret,
                  final StorageOSVolumeSource storageos,
                  final VsphereVirtualDiskVolumeSource vsphereVolume) {
        // no-op
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

    public AzureFileVolumeSource getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final AzureFileVolumeSource azureFile) {
        this.azureFile = azureFile;
    }

    public CephFSVolumeSource getCephfs() {
        return cephfs;
    }

    public void setCephfs(final CephFSVolumeSource cephfs) {
        this.cephfs = cephfs;
    }

    public CinderVolumeSource getCinder() {
        return cinder;
    }

    public void setCinder(final CinderVolumeSource cinder) {
        this.cinder = cinder;
    }

    public ConfigMapVolumeSource getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ConfigMapVolumeSource configMap) {
        this.configMap = configMap;
    }

    public DownwardAPIVolumeSource getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DownwardAPIVolumeSource downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public EmptyDirVolumeSource getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final EmptyDirVolumeSource emptyDir) {
        this.emptyDir = emptyDir;
    }

    public FCVolumeSource getFc() {
        return fc;
    }

    public void setFc(final FCVolumeSource fc) {
        this.fc = fc;
    }

    public FlexVolumeSource getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final FlexVolumeSource flexVolume) {
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

    public GitRepoVolumeSource getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final GitRepoVolumeSource gitRepo) {
        this.gitRepo = gitRepo;
    }

    public GlusterfsVolumeSource getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final GlusterfsVolumeSource glusterfs) {
        this.glusterfs = glusterfs;
    }

    public HostPathVolumeSource getHostPath() {
        return hostPath;
    }

    public void setHostPath(final HostPathVolumeSource hostPath) {
        this.hostPath = hostPath;
    }

    public ISCSIVolumeSource getIscsi() {
        return iscsi;
    }

    public void setIscsi(final ISCSIVolumeSource iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public NFSVolumeSource getNfs() {
        return nfs;
    }

    public void setNfs(final NFSVolumeSource nfs) {
        this.nfs = nfs;
    }

    public PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
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

    public ProjectedVolumeSource getProjected() {
        return projected;
    }

    public void setProjected(final ProjectedVolumeSource projected) {
        this.projected = projected;
    }

    public QuobyteVolumeSource getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final QuobyteVolumeSource quobyte) {
        this.quobyte = quobyte;
    }

    public RBDVolumeSource getRbd() {
        return rbd;
    }

    public void setRbd(final RBDVolumeSource rbd) {
        this.rbd = rbd;
    }

    public ScaleIOVolumeSource getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final ScaleIOVolumeSource scaleIO) {
        this.scaleIO = scaleIO;
    }

    public SecretVolumeSource getSecret() {
        return secret;
    }

    public void setSecret(final SecretVolumeSource secret) {
        this.secret = secret;
    }

    public StorageOSVolumeSource getStorageos() {
        return storageos;
    }

    public void setStorageos(final StorageOSVolumeSource storageos) {
        this.storageos = storageos;
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
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                downwardAPI,
                emptyDir,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Volume)) {
            return false;
        }
        final Volume __otherCasted = (Volume) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }

    public Volume awsElasticBlockStore(final AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
        return this;
    }

    public Volume azureDisk(final AzureDiskVolumeSource azureDisk) {
        this.azureDisk = azureDisk;
        return this;
    }

    public Volume azureFile(final AzureFileVolumeSource azureFile) {
        this.azureFile = azureFile;
        return this;
    }

    public Volume cephfs(final CephFSVolumeSource cephfs) {
        this.cephfs = cephfs;
        return this;
    }

    public Volume cinder(final CinderVolumeSource cinder) {
        this.cinder = cinder;
        return this;
    }

    public Volume configMap(final ConfigMapVolumeSource configMap) {
        this.configMap = configMap;
        return this;
    }

    public Volume downwardAPI(final DownwardAPIVolumeSource downwardAPI) {
        this.downwardAPI = downwardAPI;
        return this;
    }

    public Volume emptyDir(final EmptyDirVolumeSource emptyDir) {
        this.emptyDir = emptyDir;
        return this;
    }

    public Volume fc(final FCVolumeSource fc) {
        this.fc = fc;
        return this;
    }

    public Volume flexVolume(final FlexVolumeSource flexVolume) {
        this.flexVolume = flexVolume;
        return this;
    }

    public Volume flocker(final FlockerVolumeSource flocker) {
        this.flocker = flocker;
        return this;
    }

    public Volume gcePersistentDisk(final GCEPersistentDiskVolumeSource gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
        return this;
    }

    public Volume gitRepo(final GitRepoVolumeSource gitRepo) {
        this.gitRepo = gitRepo;
        return this;
    }

    public Volume glusterfs(final GlusterfsVolumeSource glusterfs) {
        this.glusterfs = glusterfs;
        return this;
    }

    public Volume hostPath(final HostPathVolumeSource hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    public Volume iscsi(final ISCSIVolumeSource iscsi) {
        this.iscsi = iscsi;
        return this;
    }

    public Volume name(final String name) {
        this.name = name;
        return this;
    }

    public Volume nfs(final NFSVolumeSource nfs) {
        this.nfs = nfs;
        return this;
    }

    public Volume persistentVolumeClaim(final PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
        return this;
    }

    public Volume photonPersistentDisk(final PhotonPersistentDiskVolumeSource photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
        return this;
    }

    public Volume portworxVolume(final PortworxVolumeSource portworxVolume) {
        this.portworxVolume = portworxVolume;
        return this;
    }

    public Volume projected(final ProjectedVolumeSource projected) {
        this.projected = projected;
        return this;
    }

    public Volume quobyte(final QuobyteVolumeSource quobyte) {
        this.quobyte = quobyte;
        return this;
    }

    public Volume rbd(final RBDVolumeSource rbd) {
        this.rbd = rbd;
        return this;
    }

    public Volume scaleIO(final ScaleIOVolumeSource scaleIO) {
        this.scaleIO = scaleIO;
        return this;
    }

    public Volume secret(final SecretVolumeSource secret) {
        this.secret = secret;
        return this;
    }

    public Volume storageos(final StorageOSVolumeSource storageos) {
        this.storageos = storageos;
        return this;
    }

    public Volume vsphereVolume(final VsphereVirtualDiskVolumeSource vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
        return this;
    }

    @Override
    public Volume validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (awsElasticBlockStore != null ? "\"awsElasticBlockStore\":" + awsElasticBlockStore.asJson() : ""),
                    (azureDisk != null ? "\"azureDisk\":" + azureDisk.asJson() : ""),
                    (azureFile != null ? "\"azureFile\":" + azureFile.asJson() : ""),
                    (cephfs != null ? "\"cephfs\":" + cephfs.asJson() : ""),
                    (cinder != null ? "\"cinder\":" + cinder.asJson() : ""),
                    (configMap != null ? "\"configMap\":" + configMap.asJson() : ""),
                    (downwardAPI != null ? "\"downwardAPI\":" + downwardAPI.asJson() : ""),
                    (emptyDir != null ? "\"emptyDir\":" + emptyDir.asJson() : ""),
                    (fc != null ? "\"fc\":" + fc.asJson() : ""),
                    (flexVolume != null ? "\"flexVolume\":" + flexVolume.asJson() : ""),
                    (flocker != null ? "\"flocker\":" + flocker.asJson() : ""),
                    (gcePersistentDisk != null ? "\"gcePersistentDisk\":" + gcePersistentDisk.asJson() : ""),
                    (gitRepo != null ? "\"gitRepo\":" + gitRepo.asJson() : ""),
                    (glusterfs != null ? "\"glusterfs\":" + glusterfs.asJson() : ""),
                    (hostPath != null ? "\"hostPath\":" + hostPath.asJson() : ""),
                    (iscsi != null ? "\"iscsi\":" + iscsi.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (nfs != null ? "\"nfs\":" + nfs.asJson() : ""),
                    (persistentVolumeClaim != null ? "\"persistentVolumeClaim\":" + persistentVolumeClaim.asJson() : ""),
                    (photonPersistentDisk != null ? "\"photonPersistentDisk\":" + photonPersistentDisk.asJson() : ""),
                    (portworxVolume != null ? "\"portworxVolume\":" + portworxVolume.asJson() : ""),
                    (projected != null ? "\"projected\":" + projected.asJson() : ""),
                    (quobyte != null ? "\"quobyte\":" + quobyte.asJson() : ""),
                    (rbd != null ? "\"rbd\":" + rbd.asJson() : ""),
                    (scaleIO != null ? "\"scaleIO\":" + scaleIO.asJson() : ""),
                    (secret != null ? "\"secret\":" + secret.asJson() : ""),
                    (storageos != null ? "\"storageos\":" + storageos.asJson() : ""),
                    (vsphereVolume != null ? "\"vsphereVolume\":" + vsphereVolume.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
