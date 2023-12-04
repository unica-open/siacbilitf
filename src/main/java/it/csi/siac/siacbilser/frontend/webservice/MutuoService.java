/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AggiornaMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AggiornaMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AggiornaPianoAmmortamentoMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AggiornaPianoAmmortamentoMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AggiornaRipartizioneMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AggiornaRipartizioneMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AnnullaMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AnnullaMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AnnullaPianoAmmortamentoMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AnnullaPianoAmmortamentoMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AnnullaRipartizioneMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.AnnullaRipartizioneMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.EliminaAssociazioneMovimentiGestioneMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.EliminaAssociazioneMovimentiGestioneMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.EliminaAssociazioneProgettiMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.EliminaAssociazioneProgettiMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.InserisciAssociazioneMovimentiGestioneMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.InserisciAssociazioneMovimentiGestioneMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.InserisciAssociazioneProgettiMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.InserisciAssociazioneProgettiMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.InserisciMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.InserisciMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.InserisciVariazioneMassivaTassoMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.InserisciVariazioneMassivaTassoMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.InserisciVariazioneMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.InserisciVariazioneMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.LeggiPeriodiRimborsoMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.LeggiPeriodiRimborsoMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.MovimentiGestioneAssociatiMutuoExcelReport;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.MovimentiGestioneAssociatiMutuoExcelReportResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.PianoAmmortamentoMutuoExcelReport;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.PianoAmmortamentoMutuoExcelReportResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.ProgettiAssociatiMutuoExcelReport;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.ProgettiAssociatiMutuoExcelReportResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaAccertamentiAssociabiliMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaAccertamentiAssociabiliMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaAccertamentiAssociatiMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaAccertamentiAssociatiMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaDettaglioMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaDettaglioMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaImpegniAssociabiliMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaImpegniAssociabiliMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaImpegniAssociatiMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaImpegniAssociatiMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaProgettiAssociabiliMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaProgettiAssociabiliMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaSinteticaMutuo;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RicercaSinteticaMutuoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RipartizioneMutuoExcelReport;
import it.csi.siac.siacbilser.frontend.webservice.msg.mutuo.RipartizioneMutuoExcelReportResponse;


@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "MutuoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface MutuoService {
	@WebMethod @WebResult InserisciMutuoResponse inserisciMutuo(@WebParam InserisciMutuo parameters);

	@WebMethod @WebResult AggiornaMutuoResponse aggiornaMutuo(@WebParam AggiornaMutuo parameters);
	
	@WebMethod @WebResult AnnullaMutuoResponse annullaMutuo(@WebParam AnnullaMutuo parameters);
	
	@WebMethod @WebResult RicercaSinteticaMutuoResponse ricercaSinteticaMutuo(@WebParam RicercaSinteticaMutuo parameters);
	
	@WebMethod @WebResult RicercaDettaglioMutuoResponse ricercaDettaglioMutuo(@WebParam RicercaDettaglioMutuo parameters);
	
	@WebMethod @WebResult LeggiPeriodiRimborsoMutuoResponse leggiPeriodiRimborsoMutuo(@WebParam LeggiPeriodiRimborsoMutuo parameters);
	
	@WebMethod @WebResult AggiornaPianoAmmortamentoMutuoResponse aggiornaPianoAmmortamentoMutuo(@WebParam AggiornaPianoAmmortamentoMutuo parameters);
	
	@WebMethod @WebResult InserisciVariazioneMutuoResponse inserisciVariazioneMutuo(@WebParam InserisciVariazioneMutuo parameters);
	
	@WebMethod @WebResult InserisciVariazioneMassivaTassoMutuoResponse inserisciVariazioneMassivaTassoMutuo(@WebParam InserisciVariazioneMassivaTassoMutuo parameters);
	
	@WebMethod @WebResult AnnullaPianoAmmortamentoMutuoResponse annullaPianoAmmortamentoMutuo(@WebParam AnnullaPianoAmmortamentoMutuo parameters);
	
	@WebMethod @WebResult RicercaImpegniAssociabiliMutuoResponse ricercaImpegniAssociabiliMutuo(@WebParam RicercaImpegniAssociabiliMutuo parameters);
	
	@WebMethod @WebResult RicercaAccertamentiAssociabiliMutuoResponse ricercaAccertamentiAssociabiliMutuo(@WebParam RicercaAccertamentiAssociabiliMutuo parameters);
	
	@WebMethod @WebResult InserisciAssociazioneMovimentiGestioneMutuoResponse inserisciAssociazioneMovimentiGestioneMutuo(@WebParam InserisciAssociazioneMovimentiGestioneMutuo parameters);
	
	@WebMethod @WebResult EliminaAssociazioneMovimentiGestioneMutuoResponse eliminaAssociazioneMovimentiGestioneMutuo(@WebParam EliminaAssociazioneMovimentiGestioneMutuo parameters);
	
	@WebMethod @WebResult RicercaImpegniAssociatiMutuoResponse ricercaImpegniAssociatiMutuo(@WebParam RicercaImpegniAssociatiMutuo parameters);
	
	@WebMethod @WebResult RicercaAccertamentiAssociatiMutuoResponse ricercaAccertamentiAssociatiMutuo(@WebParam RicercaAccertamentiAssociatiMutuo parameters);
	
	@WebMethod @WebResult PianoAmmortamentoMutuoExcelReportResponse pianoAmmortamentoMutuoExcelReport(@WebParam PianoAmmortamentoMutuoExcelReport parameters);

	@WebMethod @WebResult AggiornaRipartizioneMutuoResponse aggiornaRipartizioneMutuo(@WebParam AggiornaRipartizioneMutuo parameters);
	
	@WebMethod @WebResult AnnullaRipartizioneMutuoResponse annullaRipartizioneMutuo(@WebParam AnnullaRipartizioneMutuo parameters);
	
	@WebMethod @WebResult MovimentiGestioneAssociatiMutuoExcelReportResponse movimentiGestioneAssociatiMutuoExcelReport(@WebParam MovimentiGestioneAssociatiMutuoExcelReport parameters);
	
	@WebMethod @WebResult RipartizioneMutuoExcelReportResponse ripartizioneMutuoExcelReport(@WebParam RipartizioneMutuoExcelReport parameters);
	
	@WebMethod @WebResult EliminaAssociazioneProgettiMutuoResponse eliminaAssociazioneProgettiMutuo(@WebParam EliminaAssociazioneProgettiMutuo parameters);
	
	@WebMethod @WebResult RicercaProgettiAssociabiliMutuoResponse ricercaProgettiAssociabiliMutuo(@WebParam RicercaProgettiAssociabiliMutuo parameters);
	
	@WebMethod @WebResult InserisciAssociazioneProgettiMutuoResponse inserisciAssociazioneProgettiMutuo(@WebParam InserisciAssociazioneProgettiMutuo parameters);
	
	@WebMethod @WebResult ProgettiAssociatiMutuoExcelReportResponse progettiAssociatiMutuoExcelReport(@WebParam ProgettiAssociatiMutuoExcelReport parameters);
}
