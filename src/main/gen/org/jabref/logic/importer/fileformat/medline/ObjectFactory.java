//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.12 at 06:37:33 PM BRT 
//


package org.jabref.logic.importer.fileformat.medline;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jabref.logic.importer.fileformat.medline package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MedlinePgn_QNAME = new QName("", "MedlinePgn");
    private final static QName _EndPage_QNAME = new QName("", "EndPage");
    private final static QName _NlmUniqueID_QNAME = new QName("", "NlmUniqueID");
    private final static QName _ContractNumber_QNAME = new QName("", "ContractNumber");
    private final static QName _Issue_QNAME = new QName("", "Issue");
    private final static QName _CopyrightInformation_QNAME = new QName("", "CopyrightInformation");
    private final static QName _ISOAbbreviation_QNAME = new QName("", "ISOAbbreviation");
    private final static QName _NumberOfReferences_QNAME = new QName("", "NumberOfReferences");
    private final static QName _Month_QNAME = new QName("", "Month");
    private final static QName _Item_QNAME = new QName("", "Item");
    private final static QName _CitationSubset_QNAME = new QName("", "CitationSubset");
    private final static QName _VolumeTitle_QNAME = new QName("", "VolumeTitle");
    private final static QName _PublicationStatus_QNAME = new QName("", "PublicationStatus");
    private final static QName _RefSource_QNAME = new QName("", "RefSource");
    private final static QName _Affiliation_QNAME = new QName("", "Affiliation");
    private final static QName _SpaceFlightMission_QNAME = new QName("", "SpaceFlightMission");
    private final static QName _ForeName_QNAME = new QName("", "ForeName");
    private final static QName _Hour_QNAME = new QName("", "Hour");
    private final static QName _Format_QNAME = new QName("", "format");
    private final static QName _MedlineTA_QNAME = new QName("", "MedlineTA");
    private final static QName _Initials_QNAME = new QName("", "Initials");
    private final static QName _Edition_QNAME = new QName("", "Edition");
    private final static QName _Suffix_QNAME = new QName("", "Suffix");
    private final static QName _Isbn_QNAME = new QName("", "Isbn");
    private final static QName _Volume_QNAME = new QName("", "Volume");
    private final static QName _Medium_QNAME = new QName("", "Medium");
    private final static QName _PublisherName_QNAME = new QName("", "PublisherName");
    private final static QName _Note_QNAME = new QName("", "Note");
    private final static QName _Country_QNAME = new QName("", "Country");
    private final static QName _LastName_QNAME = new QName("", "LastName");
    private final static QName _AccessionNumber_QNAME = new QName("", "AccessionNumber");
    private final static QName _MedlineDate_QNAME = new QName("", "MedlineDate");
    private final static QName _Sub_QNAME = new QName("", "sub");
    private final static QName _DataBankName_QNAME = new QName("", "DataBankName");
    private final static QName _Sup_QNAME = new QName("", "sup");
    private final static QName _PublisherLocation_QNAME = new QName("", "PublisherLocation");
    private final static QName _Minute_QNAME = new QName("", "Minute");
    private final static QName _Language_QNAME = new QName("", "Language");
    private final static QName _Season_QNAME = new QName("", "Season");
    private final static QName _GeneSymbol_QNAME = new QName("", "GeneSymbol");
    private final static QName _RegistryNumber_QNAME = new QName("", "RegistryNumber");
    private final static QName _B_QNAME = new QName("", "b");
    private final static QName _Agency_QNAME = new QName("", "Agency");
    private final static QName _Title_QNAME = new QName("", "Title");
    private final static QName _I_QNAME = new QName("", "i");
    private final static QName _CitationString_QNAME = new QName("", "CitationString");
    private final static QName _VernacularTitle_QNAME = new QName("", "VernacularTitle");
    private final static QName _Year_QNAME = new QName("", "Year");
    private final static QName _Second_QNAME = new QName("", "Second");
    private final static QName _StartPage_QNAME = new QName("", "StartPage");
    private final static QName _U_QNAME = new QName("", "u");
    private final static QName _ReportNumber_QNAME = new QName("", "ReportNumber");
    private final static QName _CollectiveName_QNAME = new QName("", "CollectiveName");
    private final static QName _GrantID_QNAME = new QName("", "GrantID");
    private final static QName _ISSNLinking_QNAME = new QName("", "ISSNLinking");
    private final static QName _Acronym_QNAME = new QName("", "Acronym");
    private final static QName _Day_QNAME = new QName("", "Day");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jabref.logic.importer.fileformat.medline
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GrantList }
     * 
     */
    public GrantList createGrantList() {
        return new GrantList();
    }

    /**
     * Create an instance of {@link Grant }
     * 
     */
    public Grant createGrant() {
        return new Grant();
    }

    /**
     * Create an instance of {@link GeneSymbolList }
     * 
     */
    public GeneSymbolList createGeneSymbolList() {
        return new GeneSymbolList();
    }

    /**
     * Create an instance of {@link History }
     * 
     */
    public History createHistory() {
        return new History();
    }

    /**
     * Create an instance of {@link PubMedPubDate }
     * 
     */
    public PubMedPubDate createPubMedPubDate() {
        return new PubMedPubDate();
    }

    /**
     * Create an instance of {@link NormalDate }
     * 
     */
    public NormalDate createNormalDate() {
        return new NormalDate();
    }

    /**
     * Create an instance of {@link NameOfSubstance }
     * 
     */
    public NameOfSubstance createNameOfSubstance() {
        return new NameOfSubstance();
    }

    /**
     * Create an instance of {@link MedlineJournalInfo }
     * 
     */
    public MedlineJournalInfo createMedlineJournalInfo() {
        return new MedlineJournalInfo();
    }

    /**
     * Create an instance of {@link BeginningDate }
     * 
     */
    public BeginningDate createBeginningDate() {
        return new BeginningDate();
    }

    /**
     * Create an instance of {@link CollectionTitle }
     * 
     */
    public CollectionTitle createCollectionTitle() {
        return new CollectionTitle();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link PubmedBookArticle }
     * 
     */
    public PubmedBookArticle createPubmedBookArticle() {
        return new PubmedBookArticle();
    }

    /**
     * Create an instance of {@link BookDocument }
     * 
     */
    public BookDocument createBookDocument() {
        return new BookDocument();
    }

    /**
     * Create an instance of {@link PMID }
     * 
     */
    public PMID createPMID() {
        return new PMID();
    }

    /**
     * Create an instance of {@link ArticleIdList }
     * 
     */
    public ArticleIdList createArticleIdList() {
        return new ArticleIdList();
    }

    /**
     * Create an instance of {@link ArticleId }
     * 
     */
    public ArticleId createArticleId() {
        return new ArticleId();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Create an instance of {@link BookTitle }
     * 
     */
    public BookTitle createBookTitle() {
        return new BookTitle();
    }

    /**
     * Create an instance of {@link PubDate }
     * 
     */
    public PubDate createPubDate() {
        return new PubDate();
    }

    /**
     * Create an instance of {@link EndingDate }
     * 
     */
    public EndingDate createEndingDate() {
        return new EndingDate();
    }

    /**
     * Create an instance of {@link AuthorList }
     * 
     */
    public AuthorList createAuthorList() {
        return new AuthorList();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link AffiliationInfo }
     * 
     */
    public AffiliationInfo createAffiliationInfo() {
        return new AffiliationInfo();
    }

    /**
     * Create an instance of {@link ELocationID }
     * 
     */
    public ELocationID createELocationID() {
        return new ELocationID();
    }

    /**
     * Create an instance of {@link LocationLabel }
     * 
     */
    public LocationLabel createLocationLabel() {
        return new LocationLabel();
    }

    /**
     * Create an instance of {@link ArticleTitle }
     * 
     */
    public ArticleTitle createArticleTitle() {
        return new ArticleTitle();
    }

    /**
     * Create an instance of {@link Pagination }
     * 
     */
    public Pagination createPagination() {
        return new Pagination();
    }

    /**
     * Create an instance of {@link PublicationType }
     * 
     */
    public PublicationType createPublicationType() {
        return new PublicationType();
    }

    /**
     * Create an instance of {@link Abstract }
     * 
     */
    public Abstract createAbstract() {
        return new Abstract();
    }

    /**
     * Create an instance of {@link AbstractText }
     * 
     */
    public AbstractText createAbstractText() {
        return new AbstractText();
    }

    /**
     * Create an instance of {@link Sections }
     * 
     */
    public Sections createSections() {
        return new Sections();
    }

    /**
     * Create an instance of {@link Section }
     * 
     */
    public Section createSection() {
        return new Section();
    }

    /**
     * Create an instance of {@link SectionTitle }
     * 
     */
    public SectionTitle createSectionTitle() {
        return new SectionTitle();
    }

    /**
     * Create an instance of {@link KeywordList }
     * 
     */
    public KeywordList createKeywordList() {
        return new KeywordList();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link ContributionDate }
     * 
     */
    public ContributionDate createContributionDate() {
        return new ContributionDate();
    }

    /**
     * Create an instance of {@link DateRevised }
     * 
     */
    public DateRevised createDateRevised() {
        return new DateRevised();
    }

    /**
     * Create an instance of {@link ItemList }
     * 
     */
    public ItemList createItemList() {
        return new ItemList();
    }

    /**
     * Create an instance of {@link PubmedBookData }
     * 
     */
    public PubmedBookData createPubmedBookData() {
        return new PubmedBookData();
    }

    /**
     * Create an instance of {@link ObjectList }
     * 
     */
    public ObjectList createObjectList() {
        return new ObjectList();
    }

    /**
     * Create an instance of {@link Object }
     * 
     */
    public Object createObject() {
        return new Object();
    }

    /**
     * Create an instance of {@link Param }
     * 
     */
    public Param createParam() {
        return new Param();
    }

    /**
     * Create an instance of {@link GeneralNote }
     * 
     */
    public GeneralNote createGeneralNote() {
        return new GeneralNote();
    }

    /**
     * Create an instance of {@link JournalIssue }
     * 
     */
    public JournalIssue createJournalIssue() {
        return new JournalIssue();
    }

    /**
     * Create an instance of {@link BookDocumentSet }
     * 
     */
    public BookDocumentSet createBookDocumentSet() {
        return new BookDocumentSet();
    }

    /**
     * Create an instance of {@link DeleteDocument }
     * 
     */
    public DeleteDocument createDeleteDocument() {
        return new DeleteDocument();
    }

    /**
     * Create an instance of {@link PubmedArticleSet }
     * 
     */
    public PubmedArticleSet createPubmedArticleSet() {
        return new PubmedArticleSet();
    }

    /**
     * Create an instance of {@link PubmedArticle }
     * 
     */
    public PubmedArticle createPubmedArticle() {
        return new PubmedArticle();
    }

    /**
     * Create an instance of {@link MedlineCitation }
     * 
     */
    public MedlineCitation createMedlineCitation() {
        return new MedlineCitation();
    }

    /**
     * Create an instance of {@link DateCreated }
     * 
     */
    public DateCreated createDateCreated() {
        return new DateCreated();
    }

    /**
     * Create an instance of {@link DateCompleted }
     * 
     */
    public DateCompleted createDateCompleted() {
        return new DateCompleted();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link Journal }
     * 
     */
    public Journal createJournal() {
        return new Journal();
    }

    /**
     * Create an instance of {@link ISSN }
     * 
     */
    public ISSN createISSN() {
        return new ISSN();
    }

    /**
     * Create an instance of {@link DataBankList }
     * 
     */
    public DataBankList createDataBankList() {
        return new DataBankList();
    }

    /**
     * Create an instance of {@link DataBank }
     * 
     */
    public DataBank createDataBank() {
        return new DataBank();
    }

    /**
     * Create an instance of {@link AccessionNumberList }
     * 
     */
    public AccessionNumberList createAccessionNumberList() {
        return new AccessionNumberList();
    }

    /**
     * Create an instance of {@link PublicationTypeList }
     * 
     */
    public PublicationTypeList createPublicationTypeList() {
        return new PublicationTypeList();
    }

    /**
     * Create an instance of {@link ArticleDate }
     * 
     */
    public ArticleDate createArticleDate() {
        return new ArticleDate();
    }

    /**
     * Create an instance of {@link ChemicalList }
     * 
     */
    public ChemicalList createChemicalList() {
        return new ChemicalList();
    }

    /**
     * Create an instance of {@link Chemical }
     * 
     */
    public Chemical createChemical() {
        return new Chemical();
    }

    /**
     * Create an instance of {@link SupplMeshList }
     * 
     */
    public SupplMeshList createSupplMeshList() {
        return new SupplMeshList();
    }

    /**
     * Create an instance of {@link SupplMeshName }
     * 
     */
    public SupplMeshName createSupplMeshName() {
        return new SupplMeshName();
    }

    /**
     * Create an instance of {@link CommentsCorrectionsList }
     * 
     */
    public CommentsCorrectionsList createCommentsCorrectionsList() {
        return new CommentsCorrectionsList();
    }

    /**
     * Create an instance of {@link CommentsCorrections }
     * 
     */
    public CommentsCorrections createCommentsCorrections() {
        return new CommentsCorrections();
    }

    /**
     * Create an instance of {@link MeshHeadingList }
     * 
     */
    public MeshHeadingList createMeshHeadingList() {
        return new MeshHeadingList();
    }

    /**
     * Create an instance of {@link MeshHeading }
     * 
     */
    public MeshHeading createMeshHeading() {
        return new MeshHeading();
    }

    /**
     * Create an instance of {@link DescriptorName }
     * 
     */
    public DescriptorName createDescriptorName() {
        return new DescriptorName();
    }

    /**
     * Create an instance of {@link QualifierName }
     * 
     */
    public QualifierName createQualifierName() {
        return new QualifierName();
    }

    /**
     * Create an instance of {@link PersonalNameSubjectList }
     * 
     */
    public PersonalNameSubjectList createPersonalNameSubjectList() {
        return new PersonalNameSubjectList();
    }

    /**
     * Create an instance of {@link PersonalNameSubject }
     * 
     */
    public PersonalNameSubject createPersonalNameSubject() {
        return new PersonalNameSubject();
    }

    /**
     * Create an instance of {@link OtherID }
     * 
     */
    public OtherID createOtherID() {
        return new OtherID();
    }

    /**
     * Create an instance of {@link OtherAbstract }
     * 
     */
    public OtherAbstract createOtherAbstract() {
        return new OtherAbstract();
    }

    /**
     * Create an instance of {@link InvestigatorList }
     * 
     */
    public InvestigatorList createInvestigatorList() {
        return new InvestigatorList();
    }

    /**
     * Create an instance of {@link Investigator }
     * 
     */
    public Investigator createInvestigator() {
        return new Investigator();
    }

    /**
     * Create an instance of {@link PubmedData }
     * 
     */
    public PubmedData createPubmedData() {
        return new PubmedData();
    }

    /**
     * Create an instance of {@link PubmedBookArticleSet }
     * 
     */
    public PubmedBookArticleSet createPubmedBookArticleSet() {
        return new PubmedBookArticleSet();
    }

    /**
     * Create an instance of {@link DeleteCitation }
     * 
     */
    public DeleteCitation createDeleteCitation() {
        return new DeleteCitation();
    }

    /**
     * Create an instance of {@link URL }
     * 
     */
    public URL createURL() {
        return new URL();
    }

    /**
     * Create an instance of {@link MedlineCitationSet }
     * 
     */
    public MedlineCitationSet createMedlineCitationSet() {
        return new MedlineCitationSet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MedlinePgn")
    public JAXBElement<String> createMedlinePgn(String value) {
        return new JAXBElement<String>(_MedlinePgn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EndPage")
    public JAXBElement<String> createEndPage(String value) {
        return new JAXBElement<String>(_EndPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NlmUniqueID")
    public JAXBElement<String> createNlmUniqueID(String value) {
        return new JAXBElement<String>(_NlmUniqueID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ContractNumber")
    public JAXBElement<String> createContractNumber(String value) {
        return new JAXBElement<String>(_ContractNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Issue")
    public JAXBElement<String> createIssue(String value) {
        return new JAXBElement<String>(_Issue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CopyrightInformation")
    public JAXBElement<String> createCopyrightInformation(String value) {
        return new JAXBElement<String>(_CopyrightInformation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ISOAbbreviation")
    public JAXBElement<String> createISOAbbreviation(String value) {
        return new JAXBElement<String>(_ISOAbbreviation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfReferences")
    public JAXBElement<String> createNumberOfReferences(String value) {
        return new JAXBElement<String>(_NumberOfReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Month")
    public JAXBElement<String> createMonth(String value) {
        return new JAXBElement<String>(_Month_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Item")
    public JAXBElement<String> createItem(String value) {
        return new JAXBElement<String>(_Item_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CitationSubset")
    public JAXBElement<String> createCitationSubset(String value) {
        return new JAXBElement<String>(_CitationSubset_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeTitle")
    public JAXBElement<Text> createVolumeTitle(Text value) {
        return new JAXBElement<Text>(_VolumeTitle_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PublicationStatus")
    public JAXBElement<String> createPublicationStatus(String value) {
        return new JAXBElement<String>(_PublicationStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RefSource")
    public JAXBElement<String> createRefSource(String value) {
        return new JAXBElement<String>(_RefSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Affiliation")
    public JAXBElement<Text> createAffiliation(Text value) {
        return new JAXBElement<Text>(_Affiliation_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpaceFlightMission")
    public JAXBElement<String> createSpaceFlightMission(String value) {
        return new JAXBElement<String>(_SpaceFlightMission_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ForeName")
    public JAXBElement<String> createForeName(String value) {
        return new JAXBElement<String>(_ForeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Hour")
    public JAXBElement<String> createHour(String value) {
        return new JAXBElement<String>(_Hour_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "format")
    public JAXBElement<Text> createFormat(Text value) {
        return new JAXBElement<Text>(_Format_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MedlineTA")
    public JAXBElement<String> createMedlineTA(String value) {
        return new JAXBElement<String>(_MedlineTA_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Initials")
    public JAXBElement<String> createInitials(String value) {
        return new JAXBElement<String>(_Initials_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Edition")
    public JAXBElement<String> createEdition(String value) {
        return new JAXBElement<String>(_Edition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Suffix")
    public JAXBElement<Text> createSuffix(Text value) {
        return new JAXBElement<Text>(_Suffix_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Isbn")
    public JAXBElement<String> createIsbn(String value) {
        return new JAXBElement<String>(_Isbn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Volume")
    public JAXBElement<String> createVolume(String value) {
        return new JAXBElement<String>(_Volume_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Medium")
    public JAXBElement<String> createMedium(String value) {
        return new JAXBElement<String>(_Medium_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PublisherName")
    public JAXBElement<Text> createPublisherName(Text value) {
        return new JAXBElement<Text>(_PublisherName_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Note")
    public JAXBElement<String> createNote(String value) {
        return new JAXBElement<String>(_Note_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastName")
    public JAXBElement<String> createLastName(String value) {
        return new JAXBElement<String>(_LastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AccessionNumber")
    public JAXBElement<String> createAccessionNumber(String value) {
        return new JAXBElement<String>(_AccessionNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MedlineDate")
    public JAXBElement<String> createMedlineDate(String value) {
        return new JAXBElement<String>(_MedlineDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sub", substitutionHeadNamespace = "", substitutionHeadName = "format")
    public JAXBElement<Text> createSub(Text value) {
        return new JAXBElement<Text>(_Sub_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DataBankName")
    public JAXBElement<String> createDataBankName(String value) {
        return new JAXBElement<String>(_DataBankName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sup", substitutionHeadNamespace = "", substitutionHeadName = "format")
    public JAXBElement<Text> createSup(Text value) {
        return new JAXBElement<Text>(_Sup_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PublisherLocation")
    public JAXBElement<String> createPublisherLocation(String value) {
        return new JAXBElement<String>(_PublisherLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Minute")
    public JAXBElement<String> createMinute(String value) {
        return new JAXBElement<String>(_Minute_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Language")
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Season")
    public JAXBElement<String> createSeason(String value) {
        return new JAXBElement<String>(_Season_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GeneSymbol")
    public JAXBElement<String> createGeneSymbol(String value) {
        return new JAXBElement<String>(_GeneSymbol_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RegistryNumber")
    public JAXBElement<String> createRegistryNumber(String value) {
        return new JAXBElement<String>(_RegistryNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "b", substitutionHeadNamespace = "", substitutionHeadName = "format")
    public JAXBElement<Text> createB(Text value) {
        return new JAXBElement<Text>(_B_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Agency")
    public JAXBElement<String> createAgency(String value) {
        return new JAXBElement<String>(_Agency_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "i", substitutionHeadNamespace = "", substitutionHeadName = "format")
    public JAXBElement<Text> createI(Text value) {
        return new JAXBElement<Text>(_I_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CitationString")
    public JAXBElement<Text> createCitationString(Text value) {
        return new JAXBElement<Text>(_CitationString_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VernacularTitle")
    public JAXBElement<Text> createVernacularTitle(Text value) {
        return new JAXBElement<Text>(_VernacularTitle_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Year")
    public JAXBElement<String> createYear(String value) {
        return new JAXBElement<String>(_Year_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Second")
    public JAXBElement<String> createSecond(String value) {
        return new JAXBElement<String>(_Second_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StartPage")
    public JAXBElement<String> createStartPage(String value) {
        return new JAXBElement<String>(_StartPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "u", substitutionHeadNamespace = "", substitutionHeadName = "format")
    public JAXBElement<Text> createU(Text value) {
        return new JAXBElement<Text>(_U_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ReportNumber")
    public JAXBElement<String> createReportNumber(String value) {
        return new JAXBElement<String>(_ReportNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CollectiveName")
    public JAXBElement<Text> createCollectiveName(Text value) {
        return new JAXBElement<Text>(_CollectiveName_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GrantID")
    public JAXBElement<String> createGrantID(String value) {
        return new JAXBElement<String>(_GrantID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ISSNLinking")
    public JAXBElement<String> createISSNLinking(String value) {
        return new JAXBElement<String>(_ISSNLinking_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Acronym")
    public JAXBElement<String> createAcronym(String value) {
        return new JAXBElement<String>(_Acronym_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Day")
    public JAXBElement<String> createDay(String value) {
        return new JAXBElement<String>(_Day_QNAME, String.class, null, value);
    }

}
